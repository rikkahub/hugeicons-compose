package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FitToScreen: ImageVector
    get() {
        if (_fitToScreen != null) {
            return _fitToScreen!!
        }
        _fitToScreen = ImageVector.Builder(
            name = "FitToScreen",
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
        moveTo(3f, 4f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 4f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.6216f, 9f)
        lineTo(16.5002f, 9.87868f)
        curveTo(17.5002f, 10.8787f, 18.0002f, 11.3787f, 18.0002f, 12f)
        curveTo(18.0002f, 12.6213f, 17.5002f, 13.1213f, 16.5002f, 14.1213f)
        lineTo(15.6216f, 15f)
        moveTo(8.37892f, 9f)
        lineTo(7.50024f, 9.87868f)
        curveTo(6.50024f, 10.8787f, 6.00024f, 11.3787f, 6.00024f, 12f)
        curveTo(6.00024f, 12.6213f, 6.50024f, 13.1213f, 7.50024f, 14.1213f)
        lineTo(8.37892f, 15f)
        moveTo(6.37892f, 12f)
        horizontalLineTo(17.6216f)
        }
        }.build()

        return _fitToScreen!!
    }

private var _fitToScreen: ImageVector? = null
