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

val HugeIcons.AlignHorizontalJustifyEnd: ImageVector
    get() {
        if (_alignHorizontalJustifyEnd != null) {
            return _alignHorizontalJustifyEnd!!
        }
        _alignHorizontalJustifyEnd = ImageVector.Builder(
            name = "AlignHorizontalJustifyEnd",
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
            moveTo(21f, 2f)
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
            moveTo(17f, 7.5f)
            verticalLineTo(16.497f)
            curveTo(17f, 16.9617f, 17f, 17.194f, 16.9616f, 17.3872f)
            curveTo(16.8038f, 18.1806f, 16.1836f, 18.8008f, 15.3902f, 18.9586f)
            curveTo(15.197f, 18.997f, 14.9647f, 18.997f, 14.5f, 18.997f)
            curveTo(14.0353f, 18.997f, 13.803f, 18.997f, 13.6098f, 18.9586f)
            curveTo(12.8164f, 18.8008f, 12.1962f, 18.1806f, 12.0384f, 17.3872f)
            curveTo(12f, 17.194f, 12f, 16.9617f, 12f, 16.497f)
            verticalLineTo(7.5f)
            curveTo(12f, 7.03534f, 12f, 6.80302f, 12.0384f, 6.60982f)
            curveTo(12.1962f, 5.81644f, 12.8164f, 5.19624f, 13.6098f, 5.03843f)
            curveTo(13.803f, 5f, 14.0353f, 5f, 14.5f, 5f)
            curveTo(14.9647f, 5f, 15.197f, 5f, 15.3902f, 5.03843f)
            curveTo(16.1836f, 5.19624f, 16.8038f, 5.81644f, 16.9616f, 6.60982f)
            curveTo(17f, 6.80302f, 17f, 7.03534f, 17f, 7.5f)
            close()
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
            moveTo(8f, 10.5f)
            verticalLineTo(13.497f)
            curveTo(8f, 13.9617f, 8f, 14.194f, 7.96157f, 14.3872f)
            curveTo(7.80376f, 15.1806f, 7.18356f, 15.8008f, 6.39018f, 15.9586f)
            curveTo(6.19698f, 15.997f, 5.96466f, 15.997f, 5.5f, 15.997f)
            curveTo(5.03534f, 15.997f, 4.80302f, 15.997f, 4.60982f, 15.9586f)
            curveTo(3.81644f, 15.8008f, 3.19624f, 15.1806f, 3.03843f, 14.3872f)
            curveTo(3f, 14.194f, 3f, 13.9617f, 3f, 13.497f)
            verticalLineTo(10.5f)
            curveTo(3f, 10.0353f, 3f, 9.80302f, 3.03843f, 9.60982f)
            curveTo(3.19624f, 8.81644f, 3.81644f, 8.19624f, 4.60982f, 8.03843f)
            curveTo(4.80302f, 8f, 5.03534f, 8f, 5.5f, 8f)
            curveTo(5.96466f, 8f, 6.19698f, 8f, 6.39018f, 8.03843f)
            curveTo(7.18356f, 8.19624f, 7.80376f, 8.81644f, 7.96157f, 9.60982f)
            curveTo(8f, 9.80302f, 8f, 10.0353f, 8f, 10.5f)
            close()
        }
        }.build()

        return _alignHorizontalJustifyEnd!!
    }

private var _alignHorizontalJustifyEnd: ImageVector? = null
