package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingLeft02: ImageVector
    get() {
        if (_handPointingLeft02 != null) {
            return _handPointingLeft02!!
        }
        _handPointingLeft02 = ImageVector.Builder(
            name = "HandPointingLeft02",
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
        moveTo(14f, 7.41601f)
        lineTo(10.5f, 7.41601f)
        moveTo(10.5f, 7.41601f)
        lineTo(4.25f, 7.41601f)
        curveTo(3.2835f, 7.41601f, 2.5f, 8.19951f, 2.5f, 9.16601f)
        curveTo(2.5f, 10.1325f, 3.2835f, 10.916f, 4.25f, 10.916f)
        lineTo(9.5f, 10.916f)
        lineTo(9.97758f, 13.993f)
        curveTo(10.2669f, 15.9216f, 10.4115f, 16.886f, 10.8184f, 17.5652f)
        curveTo(11.4906f, 18.6872f, 12.5f, 19.5f, 13.9736f, 19.5f)
        curveTo(15f, 19.5f, 15.6886f, 19.2463f, 17.5387f, 18.6296f)
        curveTo(18.7127f, 18.2383f, 19.2996f, 18.0426f, 19.7643f, 17.7236f)
        curveTo(20.5293f, 17.1983f, 21.0878f, 16.4233f, 21.3442f, 15.5315f)
        curveTo(21.5f, 14.9898f, 21.5f, 14.3711f, 21.5f, 13.1336f)
        lineTo(21.5f, 11.7287f)
        curveTo(21.5f, 9.94422f, 21.5f, 9.05198f, 21.1651f, 8.28584f)
        curveTo(21.0137f, 7.9397f, 20.8141f, 7.61674f, 20.5722f, 7.32659f)
        curveTo(20.0367f, 6.68438f, 19.2387f, 6.28535f, 17.6426f, 5.48731f)
        curveTo(16.3483f, 4.84015f, 15.7011f, 4.51657f, 15.0302f, 4.50082f)
        curveTo(14.7276f, 4.49372f, 14.4256f, 4.53246f, 14.1346f, 4.61571f)
        curveTo(13.4894f, 4.80031f, 12.9448f, 5.27678f, 11.8558f, 6.2297f)
        lineTo(10.5f, 7.41601f)
        }
        }.build()

        return _handPointingLeft02!!
    }

private var _handPointingLeft02: ImageVector? = null
