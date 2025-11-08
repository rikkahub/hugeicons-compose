package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GoBackward5Sec: ImageVector
    get() {
        if (_goBackward5Sec != null) {
            return _goBackward5Sec!!
        }
        _goBackward5Sec = ImageVector.Builder(
            name = "GoBackward5Sec",
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
        moveTo(12f, 5f)
        lineTo(10.8961f, 3.45459f)
        curveTo(10.4851f, 2.87911f, 10.2795f, 2.59137f, 10.4093f, 2.32411f)
        curveTo(10.5391f, 2.05684f, 10.8689f, 2.04153f, 11.5286f, 2.01092f)
        curveTo(11.6848f, 2.00367f, 11.842f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 8.72836f, 3.57111f, 5.82368f, 6f, 3.99927f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 10f)
        horizontalLineTo(10.9099f)
        curveTo(10.6716f, 10f, 10.4664f, 10.1682f, 10.4196f, 10.4019f)
        lineTo(10f, 12.5f)
        curveTo(10.6937f, 12.3348f, 11.3555f, 12.1429f, 12.0714f, 12.1429f)
        curveTo(13.1365f, 12.1429f, 14f, 13.0063f, 14f, 14.0714f)
        curveTo(14f, 15.1365f, 13.1365f, 16f, 12.0714f, 16f)
        curveTo(11.244f, 16f, 10.2627f, 16.0173f, 10.0319f, 15f)
        }
        }.build()

        return _goBackward5Sec!!
    }

private var _goBackward5Sec: ImageVector? = null
