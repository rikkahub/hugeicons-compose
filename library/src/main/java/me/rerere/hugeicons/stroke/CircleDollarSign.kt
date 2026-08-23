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

val HugeIcons.CircleDollarSign: ImageVector
    get() {
        if (_circleDollarSign != null) {
            return _circleDollarSign!!
        }
        _circleDollarSign = ImageVector.Builder(
            name = "CircleDollarSign",
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
            moveTo(12f, 22f)
            curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
            curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
            curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
            curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
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
            moveTo(9.14844f, 15f)
            curveTo(9.54108f, 15.9675f, 10.6694f, 16.6663f, 12.0002f, 16.6663f)
            curveTo(13.657f, 16.6663f, 15.0002f, 15.975f, 15.0002f, 14.2466f)
            curveTo(15.0002f, 12.5182f, 14.0002f, 11.8268f, 12.0002f, 11.8268f)
            curveTo(10.0002f, 11.8268f, 9.25017f, 11.0892f, 9.25017f, 9.75276f)
            curveTo(9.25017f, 8.41637f, 10.4814f, 7.33301f, 12.0002f, 7.33301f)
            curveTo(13.2203f, 7.33301f, 14.2548f, 8.03217f, 14.6145f, 9f)
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
            moveTo(12f, 6f)
            lineTo(12f, 18f)
        }
        }.build()

        return _circleDollarSign!!
    }

private var _circleDollarSign: ImageVector? = null
