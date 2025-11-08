package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.YenCircle: ImageVector
    get() {
        if (_yenCircle != null) {
            return _yenCircle!!
        }
        _yenCircle = ImageVector.Builder(
            name = "YenCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 7.5f)
        curveTo(9.2f, 8.41667f, 10.08f, 10.5f, 12f, 11.5f)
        moveTo(12f, 11.5f)
        curveTo(13.92f, 10.5f, 14.8f, 8.41667f, 15f, 7.5f)
        moveTo(12f, 11.5f)
        verticalLineTo(16.5f)
        moveTo(14.5f, 13.5f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _yenCircle!!
    }

private var _yenCircle: ImageVector? = null
