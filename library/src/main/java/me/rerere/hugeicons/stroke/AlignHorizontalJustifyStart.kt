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

val HugeIcons.AlignHorizontalJustifyStart: ImageVector
    get() {
        if (_alignHorizontalJustifyStart != null) {
            return _alignHorizontalJustifyStart!!
        }
        _alignHorizontalJustifyStart = ImageVector.Builder(
            name = "AlignHorizontalJustifyStart",
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
            moveTo(3f, 2f)
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
            moveTo(7f, 7.5f)
            verticalLineTo(16.497f)
            curveTo(7f, 16.9617f, 7f, 17.194f, 7.03843f, 17.3872f)
            curveTo(7.19624f, 18.1806f, 7.81644f, 18.8008f, 8.60982f, 18.9586f)
            curveTo(8.80302f, 18.997f, 9.03534f, 18.997f, 9.5f, 18.997f)
            curveTo(9.96466f, 18.997f, 10.197f, 18.997f, 10.3902f, 18.9586f)
            curveTo(11.1836f, 18.8008f, 11.8038f, 18.1806f, 11.9616f, 17.3872f)
            curveTo(12f, 17.194f, 12f, 16.9617f, 12f, 16.497f)
            verticalLineTo(7.5f)
            curveTo(12f, 7.03534f, 12f, 6.80302f, 11.9616f, 6.60982f)
            curveTo(11.8038f, 5.81644f, 11.1836f, 5.19624f, 10.3902f, 5.03843f)
            curveTo(10.197f, 5f, 9.96466f, 5f, 9.5f, 5f)
            curveTo(9.03534f, 5f, 8.80302f, 5f, 8.60982f, 5.03843f)
            curveTo(7.81644f, 5.19624f, 7.19624f, 5.81644f, 7.03843f, 6.60982f)
            curveTo(7f, 6.80302f, 7f, 7.03534f, 7f, 7.5f)
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
            moveTo(16f, 10.5f)
            verticalLineTo(13.497f)
            curveTo(16f, 13.9617f, 16f, 14.194f, 16.0384f, 14.3872f)
            curveTo(16.1962f, 15.1806f, 16.8164f, 15.8008f, 17.6098f, 15.9586f)
            curveTo(17.803f, 15.997f, 18.0353f, 15.997f, 18.5f, 15.997f)
            curveTo(18.9647f, 15.997f, 19.197f, 15.997f, 19.3902f, 15.9586f)
            curveTo(20.1836f, 15.8008f, 20.8038f, 15.1806f, 20.9616f, 14.3872f)
            curveTo(21f, 14.194f, 21f, 13.9617f, 21f, 13.497f)
            verticalLineTo(10.5f)
            curveTo(21f, 10.0353f, 21f, 9.80302f, 20.9616f, 9.60982f)
            curveTo(20.8038f, 8.81644f, 20.1836f, 8.19624f, 19.3902f, 8.03843f)
            curveTo(19.197f, 8f, 18.9647f, 8f, 18.5f, 8f)
            curveTo(18.0353f, 8f, 17.803f, 8f, 17.6098f, 8.03843f)
            curveTo(16.8164f, 8.19624f, 16.1962f, 8.81644f, 16.0384f, 9.60982f)
            curveTo(16f, 9.80302f, 16f, 10.0353f, 16f, 10.5f)
            close()
        }
        }.build()

        return _alignHorizontalJustifyStart!!
    }

private var _alignHorizontalJustifyStart: ImageVector? = null
