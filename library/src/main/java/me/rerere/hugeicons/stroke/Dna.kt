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

val HugeIcons.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = ImageVector.Builder(
            name = "Dna",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 12f)
            arcTo(5f, 5f, 0f, true, false, 7f, 12f)
            arcTo(5f, 5f, 0f, true, false, 17f, 12f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22.0004f, 8.44332f)
            curveTo(20.2212f, 10.2226f, 17.3364f, 10.2226f, 15.5571f, 8.44332f)
            curveTo(13.7778f, 6.66405f, 13.7778f, 3.77927f, 15.5571f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 15.5567f)
            curveTo(3.77927f, 13.7774f, 6.66405f, 13.7774f, 8.44332f, 15.5567f)
            curveTo(10.2226f, 17.336f, 10.2226f, 20.2207f, 8.44332f, 22f)
        }
        }.build()

        return _dna!!
    }

private var _dna: ImageVector? = null
