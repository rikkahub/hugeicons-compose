package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChangeScreenMode: ImageVector
    get() {
        if (_changeScreenMode != null) {
            return _changeScreenMode!!
        }
        _changeScreenMode = ImageVector.Builder(
            name = "ChangeScreenMode",
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
        moveTo(16f, 2f)
        horizontalLineTo(12f)
        curveTo(9.17157f, 2f, 7.75736f, 2f, 6.87868f, 2.94627f)
        curveTo(6f, 3.89254f, 6f, 5.41554f, 6f, 8.46154f)
        verticalLineTo(9.53846f)
        curveTo(6f, 12.5845f, 6f, 14.1075f, 6.87868f, 15.0537f)
        curveTo(7.75736f, 16f, 9.17157f, 16f, 12f, 16f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 16f, 20.2426f, 16f, 21.1213f, 15.0537f)
        curveTo(22f, 14.1075f, 22f, 12.5845f, 22f, 9.53846f)
        verticalLineTo(8.46154f)
        curveTo(22f, 5.41554f, 22f, 3.89254f, 21.1213f, 2.94627f)
        curveTo(20.2426f, 2f, 18.8284f, 2f, 16f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16.6082f)
        curveTo(17.9879f, 18.9537f, 17.8914f, 20.2239f, 17.123f, 21.0525f)
        curveTo(16.2442f, 22f, 14.8298f, 22f, 12.0011f, 22f)
        horizontalLineTo(8.00065f)
        curveTo(5.17192f, 22f, 3.75755f, 22f, 2.87878f, 21.0525f)
        curveTo(2f, 20.1049f, 2f, 18.5799f, 2f, 15.5298f)
        verticalLineTo(14.4515f)
        curveTo(2f, 11.4014f, 2f, 9.87638f, 2.87878f, 8.92885f)
        curveTo(3.52015f, 8.2373f, 4.44682f, 8.05047f, 6.00043f, 8f)
        }
        }.build()

        return _changeScreenMode!!
    }

private var _changeScreenMode: ImageVector? = null
