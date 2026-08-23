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

val HugeIcons.SaudiRiyal: ImageVector
    get() {
        if (_saudiRiyal != null) {
            return _saudiRiyal!!
        }
        _saudiRiyal = ImageVector.Builder(
            name = "SaudiRiyal",
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
            moveTo(10f, 3f)
            verticalLineTo(13.6754f)
            curveTo(10f, 15.7626f, 10f, 16.8062f, 9.43373f, 17.5919f)
            curveTo(8.86745f, 18.3775f, 7.87742f, 18.7075f, 5.89737f, 19.3675f)
            lineTo(4f, 20f)
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
            moveTo(14f, 3f)
            verticalLineTo(12.0217f)
            curveTo(14f, 14.4102f, 14f, 15.6044f, 14.7962f, 16.1933f)
            curveTo(15.5924f, 16.7823f, 16.7622f, 16.4533f, 19.1018f, 15.7954f)
            lineTo(20f, 15.5428f)
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
            moveTo(14f, 21f)
            lineTo(20f, 19.5f)
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
            moveTo(5f, 15f)
            lineTo(20f, 11f)
        }
        }.build()

        return _saudiRiyal!!
    }

private var _saudiRiyal: ImageVector? = null
