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

val HugeIcons.AlignHorizontalSpaceAround: ImageVector
    get() {
        if (_alignHorizontalSpaceAround != null) {
            return _alignHorizontalSpaceAround!!
        }
        _alignHorizontalSpaceAround = ImageVector.Builder(
            name = "AlignHorizontalSpaceAround",
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
            moveTo(19f, 2f)
            verticalLineTo(22f)
        }

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
            moveTo(5f, 2f)
            verticalLineTo(22f)
        }

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
            moveTo(9.5f, 9.5f)
            verticalLineTo(14.497f)
            curveTo(9.5f, 14.9617f, 9.5f, 15.194f, 9.53843f, 15.3872f)
            curveTo(9.69624f, 16.1806f, 10.3164f, 16.8008f, 11.1098f, 16.9586f)
            curveTo(11.303f, 16.997f, 11.5353f, 16.997f, 12f, 16.997f)
            curveTo(12.4647f, 16.997f, 12.697f, 16.997f, 12.8902f, 16.9586f)
            curveTo(13.6836f, 16.8008f, 14.3038f, 16.1806f, 14.4616f, 15.3872f)
            curveTo(14.5f, 15.194f, 14.5f, 14.9617f, 14.5f, 14.497f)
            verticalLineTo(9.5f)
            curveTo(14.5f, 9.03534f, 14.5f, 8.80302f, 14.4616f, 8.60982f)
            curveTo(14.3038f, 7.81644f, 13.6836f, 7.19624f, 12.8902f, 7.03843f)
            curveTo(12.697f, 7f, 12.4647f, 7f, 12f, 7f)
            curveTo(11.5353f, 7f, 11.303f, 7f, 11.1098f, 7.03843f)
            curveTo(10.3164f, 7.19624f, 9.69624f, 7.81644f, 9.53843f, 8.60982f)
            curveTo(9.5f, 8.80302f, 9.5f, 9.03534f, 9.5f, 9.5f)
            close()
        }
        }.build()

        return _alignHorizontalSpaceAround!!
    }

private var _alignHorizontalSpaceAround: ImageVector? = null
