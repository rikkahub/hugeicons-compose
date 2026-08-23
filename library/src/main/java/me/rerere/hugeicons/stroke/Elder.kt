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

val HugeIcons.Elder: ImageVector
    get() {
        if (_elder != null) {
            return _elder!!
        }
        _elder = ImageVector.Builder(
            name = "Elder",
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
            moveTo(12f, 3.125f)
            verticalLineTo(3.75f)
            moveTo(12f, 5f)
            curveTo(11.3096f, 5f, 10.75f, 4.44035f, 10.75f, 3.75f)
            curveTo(10.75f, 3.05964f, 11.3096f, 2.5f, 12f, 2.5f)
            curveTo(12.6904f, 2.5f, 13.25f, 3.05964f, 13.25f, 3.75f)
            curveTo(13.25f, 4.44035f, 12.6904f, 5f, 12f, 5f)
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
            moveTo(17f, 12f)
            lineTo(14.4693f, 11.2769f)
            curveTo(13.8596f, 11.1027f, 13.3687f, 10.6498f, 13.146f, 10.0561f)
            lineTo(12.5238f, 8.39683f)
            curveTo(12.2087f, 7.55663f, 11.4055f, 7f, 10.5082f, 7f)
            curveTo(10.174f, 7f, 9.83974f, 7.07145f, 9.56864f, 7.26687f)
            curveTo(8.51644f, 8.02532f, 7f, 9.82311f, 7f, 12f)
            curveTo(7f, 16f, 8f, 17f, 8f, 21.5f)
            moveTo(12f, 8.5f)
            curveTo(11.1667f, 9f, 9.11244f, 10.1783f, 9.5f, 13f)
            curveTo(9.78716f, 15.0907f, 12.5f, 18f, 12.5f, 21.5f)
            moveTo(11f, 8f)
            curveTo(9.83333f, 8.66667f, 8f, 10f, 8.5f, 13.5f)
            moveTo(7.61244f, 14f)
            horizontalLineTo(9.61244f)
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
            moveTo(17f, 15f)
            verticalLineTo(21.5f)
        }
        }.build()

        return _elder!!
    }

private var _elder: ImageVector? = null
