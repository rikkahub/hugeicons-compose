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

val HugeIcons.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = ImageVector.Builder(
            name = "Superscript",
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
            moveTo(2.71484f, 7.02474f)
            curveTo(4.70583f, 6.91997f, 5.95508f, 7.07715f, 6.73586f, 8.91069f)
            curveTo(7.55568f, 11.111f, 9.58571f, 17.2403f, 10.0932f, 18.6548f)
            curveTo(10.6398f, 20.174f, 11.3425f, 21.2218f, 14.2314f, 20.9598f)
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
            moveTo(15f, 7.00791f)
            curveTo(12.1371f, 6.98296f, 9.79479f, 11.7228f, 8.49349f, 13.9929f)
            curveTo(7.06206f, 16.6123f, 4.6026f, 21.1525f, 2f, 20.9779f)
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
            moveTo(22.0002f, 8.99985f)
            horizontalLineTo(18.0002f)
            lineTo(21.2003f, 6.59981f)
            curveTo(21.7039f, 6.22212f, 22.0002f, 5.62938f, 22.0002f, 4.9999f)
            curveTo(22.0002f, 3.89538f, 21.1047f, 2.99999f, 20.0001f, 3f)
            curveTo(18.8956f, 3.00001f, 18f, 3.89543f, 18f, 4.99998f)
        }
        }.build()

        return _superscript!!
    }

private var _superscript: ImageVector? = null
