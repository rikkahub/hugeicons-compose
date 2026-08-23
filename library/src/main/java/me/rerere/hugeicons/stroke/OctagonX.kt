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

val HugeIcons.OctagonX: ImageVector
    get() {
        if (_octagonX != null) {
            return _octagonX!!
        }
        _octagonX = ImageVector.Builder(
            name = "OctagonX",
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
            moveTo(14.9999f, 9f)
            lineTo(8.99994f, 15f)
            moveTo(8.99994f, 9f)
            lineTo(14.9999f, 15f)
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
            moveTo(12.6863f, 22f)
            horizontalLineTo(11.3137f)
            curveTo(9.67871f, 22f, 8.8612f, 22f, 8.12612f, 21.6955f)
            curveTo(7.39104f, 21.391f, 6.81297f, 20.813f, 5.65685f, 19.6569f)
            lineTo(4.34315f, 18.3431f)
            curveTo(3.18702f, 17.187f, 2.60896f, 16.609f, 2.30448f, 15.8739f)
            curveTo(2f, 15.1388f, 2f, 14.3213f, 2f, 12.6863f)
            verticalLineTo(11.3137f)
            curveTo(2f, 9.67871f, 2f, 8.8612f, 2.30448f, 8.12612f)
            curveTo(2.60896f, 7.39104f, 3.18702f, 6.81298f, 4.34315f, 5.65685f)
            lineTo(5.65685f, 4.34315f)
            curveTo(6.81297f, 3.18702f, 7.39104f, 2.60896f, 8.12612f, 2.30448f)
            curveTo(8.8612f, 2f, 9.67871f, 2f, 11.3137f, 2f)
            horizontalLineTo(12.6863f)
            curveTo(14.3213f, 2f, 15.1388f, 2f, 15.8739f, 2.30448f)
            curveTo(16.609f, 2.60896f, 17.187f, 3.18702f, 18.3431f, 4.34315f)
            lineTo(19.6569f, 5.65685f)
            curveTo(20.813f, 6.81297f, 21.391f, 7.39104f, 21.6955f, 8.12612f)
            curveTo(22f, 8.8612f, 22f, 9.67871f, 22f, 11.3137f)
            verticalLineTo(12.6863f)
            curveTo(22f, 14.3213f, 22f, 15.1388f, 21.6955f, 15.8739f)
            curveTo(21.391f, 16.609f, 20.813f, 17.187f, 19.6569f, 18.3431f)
            lineTo(18.3431f, 19.6569f)
            curveTo(17.187f, 20.813f, 16.609f, 21.391f, 15.8739f, 21.6955f)
            curveTo(15.1388f, 22f, 14.3213f, 22f, 12.6863f, 22f)
            close()
        }
        }.build()

        return _octagonX!!
    }

private var _octagonX: ImageVector? = null
