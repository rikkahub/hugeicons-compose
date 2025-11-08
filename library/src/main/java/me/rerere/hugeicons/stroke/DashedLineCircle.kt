package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DashedLineCircle: ImageVector
    get() {
        if (_dashedLineCircle != null) {
            return _dashedLineCircle!!
        }
        _dashedLineCircle = ImageVector.Builder(
            name = "DashedLineCircle",
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
        moveTo(14f, 2.20004f)
        curveTo(13.3538f, 2.06886f, 12.6849f, 2f, 12f, 2f)
        curveTo(11.3151f, 2f, 10.6462f, 2.06886f, 10f, 2.20004f)
        moveTo(21.8f, 10f)
        curveTo(21.9311f, 10.6462f, 22f, 11.3151f, 22f, 12f)
        curveTo(22f, 12.6849f, 21.9311f, 13.3538f, 21.8f, 14f)
        moveTo(14f, 21.8f)
        curveTo(13.3538f, 21.9311f, 12.6849f, 22f, 12f, 22f)
        curveTo(11.3151f, 22f, 10.6462f, 21.9311f, 10f, 21.8f)
        moveTo(2.20004f, 14f)
        curveTo(2.06886f, 13.3538f, 2f, 12.6849f, 2f, 12f)
        curveTo(2f, 11.3151f, 2.06886f, 10.6462f, 2.20004f, 10f)
        moveTo(17.5f, 3.64702f)
        curveTo(18.6332f, 4.39469f, 19.6053f, 5.36678f, 20.353f, 6.5f)
        moveTo(20.353f, 17.5f)
        curveTo(19.6053f, 18.6332f, 18.6332f, 19.6053f, 17.5f, 20.353f)
        moveTo(6.5f, 20.353f)
        curveTo(5.36678f, 19.6053f, 4.39469f, 18.6332f, 3.64702f, 17.5f)
        moveTo(3.64702f, 6.5f)
        curveTo(4.39469f, 5.36678f, 5.36678f, 4.39469f, 6.5f, 3.64702f)
        }
        }.build()

        return _dashedLineCircle!!
    }

private var _dashedLineCircle: ImageVector? = null
