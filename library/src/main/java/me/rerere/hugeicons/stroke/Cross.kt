package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = ImageVector.Builder(
            name = "Cross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.5f, 7.5f)
            verticalLineTo(5.5f)
            curveTo(14.5f, 5.03534f, 14.5f, 4.80302f, 14.4616f, 4.60982f)
            curveTo(14.3038f, 3.81644f, 13.6836f, 3.19624f, 12.8902f, 3.03843f)
            curveTo(12.697f, 3f, 12.4647f, 3f, 12f, 3f)
            curveTo(11.5353f, 3f, 11.303f, 3f, 11.1098f, 3.03843f)
            curveTo(10.3164f, 3.19624f, 9.69624f, 3.81644f, 9.53843f, 4.60982f)
            curveTo(9.5f, 4.80302f, 9.5f, 5.03534f, 9.5f, 5.5f)
            verticalLineTo(7.5f)
            curveTo(9.5f, 8.44281f, 9.5f, 8.91421f, 9.20711f, 9.20711f)
            curveTo(8.91421f, 9.5f, 8.44281f, 9.5f, 7.5f, 9.5f)
            horizontalLineTo(5.5f)
            curveTo(5.03535f, 9.5f, 4.80302f, 9.5f, 4.60982f, 9.53843f)
            curveTo(3.81644f, 9.69624f, 3.19624f, 10.3164f, 3.03843f, 11.1098f)
            curveTo(3f, 11.303f, 3f, 11.5353f, 3f, 12f)
            curveTo(3f, 12.4647f, 3f, 12.697f, 3.03843f, 12.8902f)
            curveTo(3.19624f, 13.6836f, 3.81644f, 14.3038f, 4.60982f, 14.4616f)
            curveTo(4.80302f, 14.5f, 5.03534f, 14.5f, 5.5f, 14.5f)
            horizontalLineTo(7.49998f)
            curveTo(8.4428f, 14.5f, 8.91421f, 14.5f, 9.2071f, 14.7929f)
            curveTo(9.49999f, 15.0858f, 9.49999f, 15.5572f, 9.49998f, 16.5f)
            lineTo(9.49995f, 18.5f)
            curveTo(9.49995f, 18.9646f, 9.49995f, 19.197f, 9.53838f, 19.3902f)
            curveTo(9.69619f, 20.1836f, 10.3164f, 20.8037f, 11.1097f, 20.9616f)
            curveTo(11.303f, 21f, 11.5353f, 21f, 12f, 21f)
            curveTo(12.4647f, 21f, 12.697f, 21f, 12.8902f, 20.9616f)
            curveTo(13.6836f, 20.8038f, 14.3038f, 20.1836f, 14.4616f, 19.3902f)
            curveTo(14.5f, 19.197f, 14.5f, 18.9647f, 14.5f, 18.5f)
            verticalLineTo(16.5f)
            curveTo(14.5f, 15.5572f, 14.5f, 15.0858f, 14.7929f, 14.7929f)
            curveTo(15.0858f, 14.5f, 15.5572f, 14.5f, 16.5f, 14.5f)
            horizontalLineTo(18.5f)
            curveTo(18.9647f, 14.5f, 19.197f, 14.5f, 19.3902f, 14.4616f)
            curveTo(20.1836f, 14.3038f, 20.8038f, 13.6836f, 20.9616f, 12.8902f)
            curveTo(21f, 12.697f, 21f, 12.4647f, 21f, 12f)
            curveTo(21f, 11.5353f, 21f, 11.303f, 20.9616f, 11.1098f)
            curveTo(20.8038f, 10.3164f, 20.1836f, 9.69624f, 19.3902f, 9.53843f)
            curveTo(19.197f, 9.5f, 18.9647f, 9.5f, 18.5f, 9.5f)
            horizontalLineTo(16.5f)
            curveTo(15.5572f, 9.5f, 15.0858f, 9.5f, 14.7929f, 9.20711f)
            curveTo(14.5f, 8.91421f, 14.5f, 8.44281f, 14.5f, 7.5f)
            close()
        }
        }.build()

        return _cross!!
    }

private var _cross: ImageVector? = null
