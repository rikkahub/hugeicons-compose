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

val HugeIcons.AlignVerticalJustifyStart: ImageVector
    get() {
        if (_alignVerticalJustifyStart != null) {
            return _alignVerticalJustifyStart!!
        }
        _alignVerticalJustifyStart = ImageVector.Builder(
            name = "AlignVerticalJustifyStart",
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
            moveTo(22f, 5f)
            horizontalLineTo(1.99997f)
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
            moveTo(7.50003f, 19f)
            lineTo(16.4971f, 19f)
            curveTo(16.9617f, 19f, 17.194f, 19f, 17.3872f, 18.9616f)
            curveTo(18.1806f, 18.8038f, 18.8008f, 18.1836f, 18.9586f, 17.3902f)
            curveTo(18.9971f, 17.197f, 18.9971f, 16.9647f, 18.9971f, 16.5f)
            curveTo(18.9971f, 16.0353f, 18.9971f, 15.803f, 18.9586f, 15.6098f)
            curveTo(18.8008f, 14.8164f, 18.1806f, 14.1962f, 17.3872f, 14.0384f)
            curveTo(17.194f, 14f, 16.9617f, 14f, 16.4971f, 14f)
            lineTo(7.50003f, 14f)
            curveTo(7.03538f, 14f, 6.80305f, 14f, 6.60985f, 14.0384f)
            curveTo(5.81647f, 14.1962f, 5.19627f, 14.8164f, 5.03846f, 15.6098f)
            curveTo(5.00003f, 15.803f, 5.00003f, 16.0353f, 5.00003f, 16.5f)
            curveTo(5.00003f, 16.9647f, 5.00003f, 17.197f, 5.03846f, 17.3902f)
            curveTo(5.19627f, 18.1836f, 5.81647f, 18.8038f, 6.60985f, 18.9616f)
            curveTo(6.80305f, 19f, 7.03537f, 19f, 7.50003f, 19f)
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
            moveTo(10.5f, 10f)
            horizontalLineTo(13.4971f)
            curveTo(13.9617f, 10f, 14.194f, 10f, 14.3872f, 9.96157f)
            curveTo(15.1806f, 9.80376f, 15.8008f, 9.18356f, 15.9586f, 8.39018f)
            curveTo(15.9971f, 8.19698f, 15.9971f, 7.96466f, 15.9971f, 7.5f)
            curveTo(15.9971f, 7.03534f, 15.9971f, 6.80302f, 15.9586f, 6.60982f)
            curveTo(15.8008f, 5.81644f, 15.1806f, 5.19624f, 14.3872f, 5.03843f)
            curveTo(14.194f, 5f, 13.9617f, 5f, 13.4971f, 5f)
            lineTo(10.5f, 5f)
            curveTo(10.0354f, 5f, 9.80305f, 5f, 9.60985f, 5.03843f)
            curveTo(8.81647f, 5.19624f, 8.19627f, 5.81644f, 8.03846f, 6.60982f)
            curveTo(8.00003f, 6.80302f, 8.00003f, 7.03535f, 8.00003f, 7.5f)
            curveTo(8.00003f, 7.96466f, 8.00003f, 8.19698f, 8.03846f, 8.39018f)
            curveTo(8.19627f, 9.18356f, 8.81647f, 9.80376f, 9.60985f, 9.96157f)
            curveTo(9.80305f, 10f, 10.0354f, 10f, 10.5f, 10f)
            close()
        }
        }.build()

        return _alignVerticalJustifyStart!!
    }

private var _alignVerticalJustifyStart: ImageVector? = null
