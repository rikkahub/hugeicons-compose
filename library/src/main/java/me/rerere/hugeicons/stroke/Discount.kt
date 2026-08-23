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

val HugeIcons.Discount: ImageVector
    get() {
        if (_discount != null) {
            return _discount!!
        }
        _discount = ImageVector.Builder(
            name = "Discount",
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
            moveTo(15.4824f, 4.0332f)
            curveTo(14.7956f, 2.81965f, 13.494f, 2f, 12f, 2f)
            curveTo(10.5059f, 2f, 9.2034f, 2.81942f, 8.5166f, 4.0332f)
            curveTo(8.34748f, 4.01139f, 8.17506f, 4f, 8f, 4f)
            curveTo(5.79086f, 4f, 4f, 5.79086f, 4f, 8f)
            curveTo(4f, 8.17506f, 4.01139f, 8.34748f, 4.0332f, 8.5166f)
            curveTo(2.81942f, 9.2034f, 2f, 10.5059f, 2f, 12f)
            curveTo(2f, 13.494f, 2.81965f, 14.7956f, 4.0332f, 15.4824f)
            curveTo(4.01131f, 15.6519f, 4f, 15.8246f, 4f, 16f)
            curveTo(4f, 18.2091f, 5.79086f, 20f, 8f, 20f)
            curveTo(8.1751f, 20f, 8.34744f, 19.9876f, 8.5166f, 19.9658f)
            curveTo(9.20329f, 21.18f, 10.5055f, 22f, 12f, 22f)
            curveTo(13.4943f, 22f, 14.7957f, 21.1798f, 15.4824f, 19.9658f)
            curveTo(15.6519f, 19.9877f, 15.8246f, 20f, 16f, 20f)
            curveTo(18.2091f, 20f, 20f, 18.2091f, 20f, 16f)
            curveTo(20f, 15.8246f, 19.9877f, 15.6519f, 19.9658f, 15.4824f)
            curveTo(21.1798f, 14.7957f, 22f, 13.4943f, 22f, 12f)
            curveTo(22f, 10.5055f, 21.18f, 9.20329f, 19.9658f, 8.5166f)
            curveTo(19.9876f, 8.34744f, 20f, 8.1751f, 20f, 8f)
            curveTo(20f, 5.79086f, 18.2091f, 4f, 16f, 4f)
            curveTo(15.8246f, 4f, 15.6519f, 4.01131f, 15.4824f, 4.0332f)
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
            moveTo(15f, 9f)
            lineTo(9f, 15f)
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
            moveTo(9.375f, 9.25f)
            horizontalLineTo(9.25f)
            moveTo(9.5f, 9.25f)
            curveTo(9.5f, 9.38807f, 9.38807f, 9.5f, 9.25f, 9.5f)
            curveTo(9.11193f, 9.5f, 9f, 9.38807f, 9f, 9.25f)
            curveTo(9f, 9.11193f, 9.11193f, 9f, 9.25f, 9f)
            curveTo(9.38807f, 9f, 9.5f, 9.11193f, 9.5f, 9.25f)
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
            moveTo(14.875f, 14.75f)
            horizontalLineTo(14.75f)
            moveTo(15f, 14.75f)
            curveTo(15f, 14.8881f, 14.8881f, 15f, 14.75f, 15f)
            curveTo(14.6119f, 15f, 14.5f, 14.8881f, 14.5f, 14.75f)
            curveTo(14.5f, 14.6119f, 14.6119f, 14.5f, 14.75f, 14.5f)
            curveTo(14.8881f, 14.5f, 15f, 14.6119f, 15f, 14.75f)
            close()
        }
        }.build()

        return _discount!!
    }

private var _discount: ImageVector? = null
