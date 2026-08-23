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

val HugeIcons.Spool: ImageVector
    get() {
        if (_spool != null) {
            return _spool!!
        }
        _spool = ImageVector.Builder(
            name = "Spool",
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
            moveTo(7f, 11f)
            lineTo(19.5951f, 6.95157f)
            curveTo(20.4323f, 6.68248f, 21f, 5.90369f, 21f, 5.02434f)
            curveTo(21f, 3.90633f, 20.0937f, 3f, 18.9757f, 3f)
            horizontalLineTo(5.02434f)
            curveTo(3.90633f, 3f, 3f, 3.90633f, 3f, 5.02434f)
            curveTo(3f, 5.90369f, 3.5677f, 6.68248f, 4.40487f, 6.95157f)
            lineTo(4.91803f, 7.11651f)
            curveTo(5.92218f, 7.43927f, 6.42426f, 7.60066f, 6.71213f, 7.99556f)
            curveTo(7f, 8.39046f, 7f, 8.91784f, 7f, 9.97259f)
            verticalLineTo(11f)
            close()
            moveTo(7f, 11f)
            verticalLineTo(16f)
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
            moveTo(17f, 13f)
            lineTo(4.40487f, 17.0484f)
            curveTo(3.5677f, 17.3175f, 3f, 18.0963f, 3f, 18.9757f)
            curveTo(3f, 20.0937f, 3.90633f, 21f, 5.02434f, 21f)
            horizontalLineTo(18.9757f)
            curveTo(20.0937f, 21f, 21f, 20.0937f, 21f, 18.9757f)
            curveTo(21f, 18.0963f, 20.4323f, 17.3175f, 19.5951f, 17.0484f)
            lineTo(19.082f, 16.8835f)
            curveTo(18.0778f, 16.5607f, 17.5757f, 16.3993f, 17.2879f, 16.0044f)
            curveTo(17f, 15.6095f, 17f, 15.0822f, 17f, 14.0274f)
            verticalLineTo(13f)
            close()
            moveTo(17f, 13f)
            verticalLineTo(8f)
        }
        }.build()

        return _spool!!
    }

private var _spool: ImageVector? = null
