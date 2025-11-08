package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Touch04: ImageVector
    get() {
        if (_touch04 != null) {
            return _touch04!!
        }
        _touch04 = ImageVector.Builder(
            name = "Touch04",
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
        moveTo(7.41601f, 14f)
        verticalLineTo(10.5f)
        moveTo(7.41601f, 10.5f)
        verticalLineTo(4.25f)
        curveTo(7.41601f, 3.2835f, 8.19951f, 2.5f, 9.16601f, 2.5f)
        curveTo(10.1325f, 2.5f, 10.916f, 3.2835f, 10.916f, 4.25f)
        verticalLineTo(9.5f)
        lineTo(13.993f, 9.97757f)
        curveTo(15.9216f, 10.2669f, 16.886f, 10.4115f, 17.5652f, 10.8184f)
        curveTo(18.6872f, 11.4906f, 19.5f, 12.5f, 19.5f, 13.9736f)
        curveTo(19.5f, 15f, 19.2463f, 15.6886f, 18.6296f, 17.5387f)
        curveTo(18.2383f, 18.7127f, 18.0426f, 19.2996f, 17.7236f, 19.7643f)
        curveTo(17.1983f, 20.5293f, 16.4233f, 21.0878f, 15.5315f, 21.3442f)
        curveTo(14.9898f, 21.5f, 14.3711f, 21.5f, 13.1336f, 21.5f)
        horizontalLineTo(11.7287f)
        curveTo(9.94422f, 21.5f, 9.05198f, 21.5f, 8.28584f, 21.1651f)
        curveTo(7.9397f, 21.0137f, 7.61674f, 20.8141f, 7.32659f, 20.5722f)
        curveTo(6.68438f, 20.0367f, 6.28536f, 19.2387f, 5.48731f, 17.6426f)
        curveTo(4.84015f, 16.3483f, 4.51657f, 15.7011f, 4.50083f, 15.0302f)
        curveTo(4.49373f, 14.7276f, 4.53246f, 14.4256f, 4.61571f, 14.1346f)
        curveTo(4.80031f, 13.4894f, 5.27678f, 12.9448f, 6.2297f, 11.8558f)
        lineTo(7.41601f, 10.5f)
        }
        }.build()

        return _touch04!!
    }

private var _touch04: ImageVector? = null
