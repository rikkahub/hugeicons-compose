package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stamp01: ImageVector
    get() {
        if (_stamp01 != null) {
            return _stamp01!!
        }
        _stamp01 = ImageVector.Builder(
            name = "Stamp01",
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
        moveTo(4.98572f, 19.1814f)
        curveTo(5.00154f, 20.4212f, 5.08263f, 20.9434f, 5.49849f, 21.4149f)
        curveTo(6.0151f, 22.0007f, 6.84657f, 22.0007f, 8.50951f, 22.0007f)
        horizontalLineTo(15.4619f)
        curveTo(17.1248f, 22.0007f, 17.9563f, 22.0007f, 18.4729f, 21.4149f)
        curveTo(18.8888f, 20.9434f, 18.9699f, 20.4212f, 18.9857f, 19.1814f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9887f, 19.0706f)
        lineTo(4.75696f, 19.0706f)
        curveTo(4.03899f, 19.0706f, 3.4179f, 18.485f, 3.50814f, 17.7727f)
        curveTo(3.6672f, 16.5171f, 4.30558f, 14.9994f, 6.83602f, 14.066f)
        curveTo(7.72556f, 13.7378f, 8.70501f, 13.4538f, 9.18761f, 12.6377f)
        curveTo(9.86497f, 11.4922f, 10.1635f, 10.2384f, 8.90009f, 8.0882f)
        curveTo(6.83602f, 4.0204f, 9.92439f, 1.99932f, 12.0114f, 1.99932f)
        curveTo(14.0983f, 1.99932f, 17.1489f, 4.1488f, 15.0643f, 8.0882f)
        curveTo(13.7986f, 10.2209f, 14.135f, 11.4922f, 14.8124f, 12.6377f)
        curveTo(15.295f, 13.4538f, 16.2744f, 13.7378f, 17.164f, 14.066f)
        curveTo(19.6944f, 14.9994f, 20.3328f, 16.5171f, 20.4918f, 17.7727f)
        curveTo(20.5821f, 18.485f, 19.961f, 19.0706f, 19.243f, 19.0706f)
        lineTo(12.0113f, 19.0706f)
        }
        }.build()

        return _stamp01!!
    }

private var _stamp01: ImageVector? = null
