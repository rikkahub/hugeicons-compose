package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Touch03: ImageVector
    get() {
        if (_touch03 != null) {
            return _touch03!!
        }
        _touch03 = ImageVector.Builder(
            name = "Touch03",
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
        moveTo(6.37124f, 12.171f)
        lineTo(8.50514f, 14f)
        verticalLineTo(4.25f)
        curveTo(8.50514f, 3.2835f, 9.28864f, 2.5f, 10.2551f, 2.5f)
        curveTo(11.2216f, 2.5f, 12.0051f, 3.2835f, 12.0051f, 4.25f)
        verticalLineTo(9.5f)
        lineTo(14.993f, 9.97757f)
        curveTo(16.9216f, 10.2669f, 17.886f, 10.4115f, 18.5652f, 10.8184f)
        curveTo(19.6872f, 11.4906f, 20.5f, 12.5f, 20.5f, 13.9736f)
        curveTo(20.5f, 15f, 20.2463f, 15.6886f, 19.6296f, 17.5387f)
        curveTo(19.2383f, 18.7127f, 19.0426f, 19.2996f, 18.7236f, 19.7643f)
        curveTo(18.1983f, 20.5293f, 17.4233f, 21.0878f, 16.5315f, 21.3442f)
        curveTo(15.9898f, 21.5f, 15.3711f, 21.5f, 14.1336f, 21.5f)
        horizontalLineTo(13.0847f)
        curveTo(11.4395f, 21.5f, 10.6169f, 21.5f, 9.88462f, 21.1981f)
        curveTo(9.75329f, 21.144f, 9.62494f, 21.0829f, 9.50012f, 21.0151f)
        curveTo(8.80405f, 20.6371f, 8.28533f, 19.9987f, 7.24791f, 18.7219f)
        lineTo(3.88941f, 14.5883f)
        curveTo(3.37331f, 13.9531f, 3.36987f, 13.0441f, 3.88114f, 12.405f)
        curveTo(4.49565f, 11.6369f, 5.62437f, 11.5308f, 6.37124f, 12.171f)
        }
        }.build()

        return _touch03!!
    }

private var _touch03: ImageVector? = null
