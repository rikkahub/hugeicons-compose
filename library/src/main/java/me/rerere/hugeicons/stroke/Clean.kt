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

val HugeIcons.Clean: ImageVector
    get() {
        if (_clean != null) {
            return _clean!!
        }
        _clean = ImageVector.Builder(
            name = "Clean",
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
            moveTo(21f, 3f)
            lineTo(13f, 11.5f)
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
            moveTo(9.44573f, 11.0854f)
            curveTo(6.96539f, 12.0368f, 4.98269f, 11.8736f, 3f, 11.0885f)
            curveTo(3.50059f, 17.531f, 6.50414f, 20.0089f, 10.5089f, 21f)
            curveTo(10.5089f, 21f, 13.5261f, 18.8664f, 13.961f, 13.8074f)
            curveTo(14.0081f, 13.2595f, 14.0317f, 12.9856f, 13.9178f, 12.6769f)
            curveTo(13.8038f, 12.3682f, 13.5802f, 12.1468f, 13.1329f, 11.704f)
            curveTo(12.3973f, 10.9757f, 12.0295f, 10.6116f, 11.5929f, 10.5204f)
            curveTo(11.1564f, 10.4293f, 10.5862f, 10.648f, 9.44573f, 11.0854f)
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
            moveTo(4.5f, 16.4464f)
            curveTo(4.5f, 16.4464f, 7f, 16.9286f, 9.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.5f, 7.25f)
            curveTo(8.5f, 7.94036f, 7.94036f, 8.5f, 7.25f, 8.5f)
            curveTo(6.55964f, 8.5f, 6f, 7.94036f, 6f, 7.25f)
            curveTo(6f, 6.55964f, 6.55964f, 6f, 7.25f, 6f)
            curveTo(7.94036f, 6f, 8.5f, 6.55964f, 8.5f, 7.25f)
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
            moveTo(11.125f, 4f)
            horizontalLineTo(11f)
            moveTo(11.25f, 4f)
            curveTo(11.25f, 4.13807f, 11.1381f, 4.25f, 11f, 4.25f)
            curveTo(10.8619f, 4.25f, 10.75f, 4.13807f, 10.75f, 4f)
            curveTo(10.75f, 3.86193f, 10.8619f, 3.75f, 11f, 3.75f)
            curveTo(11.1381f, 3.75f, 11.25f, 3.86193f, 11.25f, 4f)
            close()
        }
        }.build()

        return _clean!!
    }

private var _clean: ImageVector? = null
