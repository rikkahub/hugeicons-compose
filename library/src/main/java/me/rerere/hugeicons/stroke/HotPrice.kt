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

val HugeIcons.HotPrice: ImageVector
    get() {
        if (_hotPrice != null) {
            return _hotPrice!!
        }
        _hotPrice = ImageVector.Builder(
            name = "HotPrice",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 22f)
            curveTo(16.4183f, 22f, 20f, 18.4183f, 20f, 14f)
            curveTo(20f, 8f, 12f, 2f, 12f, 2f)
            curveTo(11.6117f, 4.48692f, 11.2315f, 5.82158f, 10f, 8f)
            curveTo(8.79908f, 7.4449f, 8.5f, 7f, 8f, 5.75f)
            curveTo(6f, 8f, 4f, 11f, 4f, 14f)
            curveTo(4f, 18.4183f, 7.58172f, 22f, 12f, 22f)
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
            moveTo(14.5f, 12.5f)
            lineTo(9.5f, 17.5f)
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
            moveTo(9.875f, 12.75f)
            horizontalLineTo(9.75f)
            moveTo(10f, 12.75f)
            curveTo(10f, 12.8881f, 9.88807f, 13f, 9.75f, 13f)
            curveTo(9.61193f, 13f, 9.5f, 12.8881f, 9.5f, 12.75f)
            curveTo(9.5f, 12.6119f, 9.61193f, 12.5f, 9.75f, 12.5f)
            curveTo(9.88807f, 12.5f, 10f, 12.6119f, 10f, 12.75f)
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
            moveTo(14.375f, 17.25f)
            horizontalLineTo(14.25f)
            moveTo(14.5f, 17.25f)
            curveTo(14.5f, 17.3881f, 14.3881f, 17.5f, 14.25f, 17.5f)
            curveTo(14.1119f, 17.5f, 14f, 17.3881f, 14f, 17.25f)
            curveTo(14f, 17.1119f, 14.1119f, 17f, 14.25f, 17f)
            curveTo(14.3881f, 17f, 14.5f, 17.1119f, 14.5f, 17.25f)
            close()
        }
        }.build()

        return _hotPrice!!
    }

private var _hotPrice: ImageVector? = null
