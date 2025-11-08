package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Grimacing: ImageVector
    get() {
        if (_grimacing != null) {
            return _grimacing!!
        }
        _grimacing = ImageVector.Builder(
            name = "Grimacing",
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
        moveTo(7f, 15f)
        curveTo(7f, 13.5949f, 7.70031f, 13f, 9f, 13f)
        horizontalLineTo(15f)
        curveTo(16.2997f, 13f, 17f, 13.5949f, 17f, 15f)
        curveTo(17f, 16.4051f, 16.2997f, 17f, 15f, 17f)
        horizontalLineTo(9f)
        curveTo(7.70031f, 17f, 7f, 16.4051f, 7f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00897f, 9f)
        lineTo(8f, 9f)
        moveTo(16f, 9f)
        lineTo(15.991f, 9f)
        }
        }.build()

        return _grimacing!!
    }

private var _grimacing: ImageVector? = null
