package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingRight03: ImageVector
    get() {
        if (_handPointingRight03 != null) {
            return _handPointingRight03!!
        }
        _handPointingRight03 = ImageVector.Builder(
            name = "HandPointingRight03",
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
        moveTo(16f, 11.5004f)
        lineTo(16f, 12.5004f)
        curveTo(16f, 13.605f, 15.1046f, 14.5004f, 14f, 14.5004f)
        moveTo(14f, 14.5004f)
        lineTo(13f, 14.5004f)
        moveTo(14f, 14.5004f)
        curveTo(14.5523f, 14.5004f, 15f, 14.9481f, 15f, 15.5004f)
        curveTo(15f, 16.605f, 14.1046f, 17.5004f, 13f, 17.5004f)
        moveTo(13f, 17.5004f)
        lineTo(12f, 17.5004f)
        moveTo(13f, 17.5004f)
        curveTo(13.5235f, 17.5004f, 13.9217f, 17.9705f, 13.8356f, 18.4868f)
        lineTo(13.7785f, 18.8292f)
        curveTo(13.6178f, 19.7936f, 12.7834f, 20.5004f, 11.8057f, 20.5004f)
        lineTo(10.3332f, 20.5f)
        curveTo(8.15984f, 20.5f, 7.07313f, 20.5f, 6.20799f, 20.1689f)
        curveTo(5.70614f, 19.9769f, 5.06612f, 19.4703f, 4.60361f, 19.0652f)
        curveTo(4.20359f, 18.7148f, 3.69618f, 18.5f, 3.1644f, 18.5f)
        lineTo(1.99983f, 18.5f)
        moveTo(14f, 11.5002f)
        lineTo(20.5f, 11.5002f)
        curveTo(21.3284f, 11.5002f, 22f, 10.8286f, 22f, 10.0002f)
        curveTo(22f, 9.17178f, 21.3284f, 8.50021f, 20.5f, 8.50021f)
        lineTo(10.5376f, 8.5f)
        lineTo(12.163f, 6.8797f)
        curveTo(12.8761f, 6.16877f, 12.8111f, 4.99772f, 12.0235f, 4.36965f)
        curveTo(11.4209f, 3.88907f, 10.5685f, 3.8758f, 9.95109f, 4.33738f)
        lineTo(5.35288f, 7.93707f)
        curveTo(4.47312f, 8.62579f, 3.11711f, 9f, 1.99983f, 9f)
        }
        }.build()

        return _handPointingRight03!!
    }

private var _handPointingRight03: ImageVector? = null
