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

val HugeIcons.AlignHorizontalSpaceBetween: ImageVector
    get() {
        if (_alignHorizontalSpaceBetween != null) {
            return _alignHorizontalSpaceBetween!!
        }
        _alignHorizontalSpaceBetween = ImageVector.Builder(
            name = "AlignHorizontalSpaceBetween",
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
            moveTo(5f, 7.5f)
            verticalLineTo(16.497f)
            curveTo(5f, 16.9617f, 5f, 17.194f, 5.03843f, 17.3872f)
            curveTo(5.19624f, 18.1806f, 5.81644f, 18.8008f, 6.60982f, 18.9586f)
            curveTo(6.80302f, 18.997f, 7.03534f, 18.997f, 7.5f, 18.997f)
            curveTo(7.96466f, 18.997f, 8.19698f, 18.997f, 8.39018f, 18.9586f)
            curveTo(9.18356f, 18.8008f, 9.80376f, 18.1806f, 9.96157f, 17.3872f)
            curveTo(10f, 17.194f, 10f, 16.9617f, 10f, 16.497f)
            verticalLineTo(7.5f)
            curveTo(10f, 7.03534f, 10f, 6.80302f, 9.96157f, 6.60982f)
            curveTo(9.80376f, 5.81644f, 9.18356f, 5.19624f, 8.39018f, 5.03843f)
            curveTo(8.19698f, 5f, 7.96466f, 5f, 7.5f, 5f)
            curveTo(7.03534f, 5f, 6.80302f, 5f, 6.60982f, 5.03843f)
            curveTo(5.81644f, 5.19624f, 5.19624f, 5.81644f, 5.03843f, 6.60982f)
            curveTo(5f, 6.80302f, 5f, 7.03534f, 5f, 7.5f)
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
            moveTo(14f, 10.5f)
            verticalLineTo(13.497f)
            curveTo(14f, 13.9617f, 14f, 14.194f, 14.0384f, 14.3872f)
            curveTo(14.1962f, 15.1806f, 14.8164f, 15.8008f, 15.6098f, 15.9586f)
            curveTo(15.803f, 15.997f, 16.0353f, 15.997f, 16.5f, 15.997f)
            curveTo(16.9647f, 15.997f, 17.197f, 15.997f, 17.3902f, 15.9586f)
            curveTo(18.1836f, 15.8008f, 18.8038f, 15.1806f, 18.9616f, 14.3872f)
            curveTo(19f, 14.194f, 19f, 13.9617f, 19f, 13.497f)
            verticalLineTo(10.5f)
            curveTo(19f, 10.0353f, 19f, 9.80302f, 18.9616f, 9.60982f)
            curveTo(18.8038f, 8.81644f, 18.1836f, 8.19624f, 17.3902f, 8.03843f)
            curveTo(17.197f, 8f, 16.9647f, 8f, 16.5f, 8f)
            curveTo(16.0353f, 8f, 15.803f, 8f, 15.6098f, 8.03843f)
            curveTo(14.8164f, 8.19624f, 14.1962f, 8.81644f, 14.0384f, 9.60982f)
            curveTo(14f, 9.80302f, 14f, 10.0353f, 14f, 10.5f)
            close()
        }
        }.build()

        return _alignHorizontalSpaceBetween!!
    }

private var _alignHorizontalSpaceBetween: ImageVector? = null
