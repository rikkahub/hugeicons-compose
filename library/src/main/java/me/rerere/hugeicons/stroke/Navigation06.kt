package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Navigation06: ImageVector
    get() {
        if (_navigation06 != null) {
            return _navigation06!!
        }
        _navigation06 = ImageVector.Builder(
            name = "Navigation06",
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
        moveTo(6.73726f, 10.4584f)
        curveTo(9.00955f, 5.81947f, 10.1457f, 3.5f, 12f, 3.5f)
        curveTo(13.8543f, 3.5f, 14.9904f, 5.81946f, 17.2627f, 10.4584f)
        lineTo(18.8101f, 13.6174f)
        curveTo(20.5552f, 17.18f, 21.4277f, 18.9613f, 20.7934f, 19.8178f)
        curveTo(20.6228f, 20.0481f, 20.398f, 20.238f, 20.1366f, 20.3729f)
        curveTo(19.1643f, 20.8743f, 17.3794f, 19.8641f, 13.8096f, 17.8436f)
        curveTo(13.0178f, 17.3954f, 12.6219f, 17.1713f, 12.1889f, 17.1312f)
        curveTo(12.0633f, 17.1196f, 11.9367f, 17.1196f, 11.8111f, 17.1312f)
        curveTo(11.3781f, 17.1713f, 10.9822f, 17.3954f, 10.1904f, 17.8436f)
        curveTo(6.62059f, 19.8641f, 4.83571f, 20.8743f, 3.86337f, 20.3729f)
        curveTo(3.60196f, 20.238f, 3.37719f, 20.0481f, 3.20664f, 19.8178f)
        curveTo(2.57226f, 18.9613f, 3.44481f, 17.18f, 5.1899f, 13.6174f)
        lineTo(6.73726f, 10.4584f)
        }
        }.build()

        return _navigation06!!
    }

private var _navigation06: ImageVector? = null
