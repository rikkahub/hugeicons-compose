package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Logout04: ImageVector
    get() {
        if (_logout04 != null) {
            return _logout04!!
        }
        _logout04 = ImageVector.Builder(
            name = "Logout04",
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
        moveTo(15f, 17.499f)
        curveTo(15f, 18.429f, 15f, 18.894f, 14.8978f, 19.2755f)
        curveTo(14.6204f, 20.3108f, 13.8117f, 21.1194f, 12.7765f, 21.3968f)
        curveTo(12.395f, 21.499f, 11.93f, 21.499f, 11f, 21.499f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 21.499f, 4.75736f, 21.499f, 3.87868f, 20.6204f)
        curveTo(3f, 19.7417f, 3f, 18.3275f, 3f, 15.499f)
        verticalLineTo(8.50113f)
        curveTo(3f, 5.67292f, 3f, 4.25882f, 3.87859f, 3.38015f)
        curveTo(4.75718f, 2.50149f, 6.17129f, 2.50137f, 8.9995f, 2.50113f)
        lineTo(11.0016f, 2.50097f)
        curveTo(11.9298f, 2.50089f, 12.394f, 2.50085f, 12.7748f, 2.60266f)
        curveTo(13.8113f, 2.87976f, 14.621f, 3.68933f, 14.8982f, 4.72584f)
        curveTo(15f, 5.10667f, 15f, 5.5708f, 15f, 6.49904f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 19.501f)
        curveTo(17.8284f, 19.501f, 19.2426f, 19.501f, 20.1213f, 18.6223f)
        curveTo(21f, 17.7436f, 21f, 16.3294f, 21f, 13.501f)
        verticalLineTo(10.501f)
        curveTo(21f, 7.67253f, 21f, 6.25832f, 20.1213f, 5.37964f)
        curveTo(19.2426f, 4.50096f, 17.8284f, 4.50096f, 15f, 4.50096f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12.001f)
        horizontalLineTo(9f)
        moveTo(14.5001f, 9.50096f)
        curveTo(14.5001f, 9.50096f, 17f, 11.3422f, 17f, 12.001f)
        curveTo(17f, 12.6598f, 14.5f, 14.501f, 14.5f, 14.501f)
        }
        }.build()

        return _logout04!!
    }

private var _logout04: ImageVector? = null
