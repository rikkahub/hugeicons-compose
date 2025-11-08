package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cardiogram02: ImageVector
    get() {
        if (_cardiogram02 != null) {
            return _cardiogram02!!
        }
        _cardiogram02 = ImageVector.Builder(
            name = "Cardiogram02",
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
        moveTo(19.4626f, 3.99352f)
        curveTo(16.7809f, 2.3486f, 14.4404f, 3.01148f, 13.0344f, 4.06738f)
        curveTo(12.4578f, 4.50033f, 12.1696f, 4.7168f, 12f, 4.7168f)
        curveTo(11.8304f, 4.7168f, 11.5422f, 4.50033f, 10.9656f, 4.06738f)
        curveTo(9.55962f, 3.01148f, 7.21909f, 2.3486f, 4.53744f, 3.99352f)
        curveTo(1.01807f, 6.1523f, 0.221719f, 13.2742f, 8.33953f, 19.2827f)
        curveTo(9.88572f, 20.4272f, 10.6588f, 20.9994f, 12f, 20.9994f)
        curveTo(13.3412f, 20.9994f, 14.1143f, 20.4272f, 15.6605f, 19.2827f)
        curveTo(23.7783f, 13.2742f, 22.9819f, 6.1523f, 19.4626f, 3.99352f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13f)
        horizontalLineTo(15f)
        curveTo(14.5447f, 13f, 14.0655f, 13.0352f, 13.6569f, 12.7214f)
        curveTo(13.5011f, 12.6017f, 13.3977f, 12.4363f, 13.191f, 12.1056f)
        lineTo(11.5f, 9f)
        lineTo(8.5f, 14f)
        lineTo(6.94338f, 11.8321f)
        curveTo(6.68722f, 11.5247f, 6.43747f, 11.213f, 6.09845f, 11.0897f)
        curveTo(5.85189f, 11f, 5.56792f, 11f, 5f, 11f)
        horizontalLineTo(3f)
        }
        }.build()

        return _cardiogram02!!
    }

private var _cardiogram02: ImageVector? = null
