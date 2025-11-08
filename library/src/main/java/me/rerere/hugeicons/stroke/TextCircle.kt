package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextCircle: ImageVector
    get() {
        if (_textCircle != null) {
            return _textCircle!!
        }
        _textCircle = ImageVector.Builder(
            name = "TextCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.3185f, 16.9775f)
        horizontalLineTo(11.9666f)
        moveTo(11.9666f, 16.9775f)
        horizontalLineTo(13.6311f)
        moveTo(11.9666f, 16.9775f)
        verticalLineTo(7.4986f)
        moveTo(7.00584f, 9.21775f)
        curveTo(6.86814f, 8.16066f, 7.14404f, 7.69382f, 8.11601f, 7.43245f)
        curveTo(10.6066f, 6.76269f, 13.3087f, 6.87472f, 15.8125f, 7.49286f)
        curveTo(16.7555f, 7.72567f, 17.0775f, 8.14056f, 16.9437f, 9.21775f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }
        }.build()

        return _textCircle!!
    }

private var _textCircle: ImageVector? = null
