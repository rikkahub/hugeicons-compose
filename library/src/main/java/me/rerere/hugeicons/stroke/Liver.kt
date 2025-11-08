package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Liver: ImageVector
    get() {
        if (_liver != null) {
            return _liver!!
        }
        _liver = ImageVector.Builder(
            name = "Liver",
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
        moveTo(18f, 8.03446f)
        curveTo(15.1204f, 8.03446f, 13.127f, 5.01107f, 10f, 5.01107f)
        curveTo(5.58172f, 5.01107f, 2f, 8.62072f, 2f, 13.0735f)
        curveTo(2f, 14.5065f, 2.17145f, 16.2117f, 2.8675f, 17.6086f)
        curveTo(3.41433f, 18.7061f, 4.68138f, 19.1636f, 5.88098f, 18.9481f)
        curveTo(10.4299f, 18.1308f, 14f, 15.0032f, 15f, 13.0047f)
        moveTo(15f, 13.0047f)
        curveTo(13.2314f, 13.1113f, 11f, 12.5051f, 9f, 11.0579f)
        moveTo(15f, 13.0047f)
        curveTo(17.8307f, 12.8342f, 22f, 10.2093f, 22f, 7.02666f)
        curveTo(22f, 3.84398f, 17f, 5.01107f, 14f, 6.46669f)
        }
        }.build()

        return _liver!!
    }

private var _liver: ImageVector? = null
