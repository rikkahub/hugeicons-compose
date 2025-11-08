package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CallEnd02: ImageVector
    get() {
        if (_callEnd02 != null) {
            return _callEnd02!!
        }
        _callEnd02 = ImageVector.Builder(
            name = "CallEnd02",
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
        moveTo(17.0539f, 6.02918f)
        verticalLineTo(8.79278f)
        curveTo(17.0539f, 9.35653f, 17.4143f, 9.87054f, 17.9747f, 10.1385f)
        curveTo(18.413f, 10.3481f, 18.9322f, 10.6067f, 19.3546f, 10.847f)
        curveTo(19.7452f, 11.0692f, 20.293f, 11.0557f, 20.6214f, 10.765f)
        lineTo(21.5133f, 9.97573f)
        curveTo(22.17f, 9.3945f, 22.1749f, 8.44418f, 21.4501f, 7.93021f)
        curveTo(15.9402f, 4.02326f, 8.05983f, 4.02326f, 2.54993f, 7.93021f)
        curveTo(1.82509f, 8.44418f, 1.82997f, 9.3945f, 2.48673f, 9.97573f)
        lineTo(3.3786f, 10.765f)
        curveTo(3.70697f, 11.0557f, 4.24369f, 11.0574f, 4.62554f, 10.8235f)
        curveTo(5.0468f, 10.5655f, 5.53006f, 10.3258f, 5.94613f, 10.1356f)
        curveTo(6.54384f, 9.86234f, 6.94607f, 9.3266f, 6.94607f, 8.73122f)
        verticalLineTo(6.02918f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 15.5f)
        curveTo(9.18814f, 16.208f, 11.0197f, 19f, 12f, 19f)
        curveTo(12.9803f, 19f, 14.8119f, 16.208f, 15.5f, 15.5f)
        moveTo(12f, 18.5f)
        verticalLineTo(11f)
        }
        }.build()

        return _callEnd02!!
    }

private var _callEnd02: ImageVector? = null
