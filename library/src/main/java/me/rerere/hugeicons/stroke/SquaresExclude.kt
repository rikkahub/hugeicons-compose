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

val HugeIcons.SquaresExclude: ImageVector
    get() {
        if (_squaresExclude != null) {
            return _squaresExclude!!
        }
        _squaresExclude = ImageVector.Builder(
            name = "SquaresExclude",
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
            moveTo(9f, 12f)
            curveTo(9f, 10.5858f, 9f, 9.87868f, 9.43934f, 9.43934f)
            curveTo(9.87868f, 9f, 10.5858f, 9f, 12f, 9f)
            horizontalLineTo(13f)
            curveTo(13.465f, 9f, 13.6975f, 9f, 13.8882f, 8.94889f)
            curveTo(14.4059f, 8.81019f, 14.8102f, 8.40587f, 14.9489f, 7.88823f)
            curveTo(15f, 7.69748f, 15f, 7.46499f, 15f, 7f)
            curveTo(15f, 6.07003f, 15f, 5.60504f, 14.8978f, 5.22354f)
            curveTo(14.6204f, 4.18827f, 13.8117f, 3.37962f, 12.7765f, 3.10222f)
            curveTo(12.395f, 3f, 11.93f, 3f, 11f, 3f)
            horizontalLineTo(9f)
            curveTo(6.17157f, 3f, 4.75736f, 3f, 3.87868f, 3.87868f)
            curveTo(3f, 4.75736f, 3f, 6.17157f, 3f, 9f)
            verticalLineTo(12f)
            curveTo(3f, 13.6569f, 4.34315f, 15f, 6f, 15f)
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
            moveTo(15f, 12f)
            curveTo(15f, 13.4142f, 15f, 14.1213f, 14.5607f, 14.5607f)
            curveTo(14.1213f, 15f, 13.4142f, 15f, 12f, 15f)
            horizontalLineTo(11f)
            curveTo(10.535f, 15f, 10.3025f, 15f, 10.1118f, 15.0511f)
            curveTo(9.59413f, 15.1898f, 9.18981f, 15.5941f, 9.05111f, 16.1118f)
            curveTo(9f, 16.3025f, 9f, 16.535f, 9f, 17f)
            curveTo(9f, 17.93f, 9f, 18.395f, 9.10222f, 18.7765f)
            curveTo(9.37962f, 19.8117f, 10.1883f, 20.6204f, 11.2235f, 20.8978f)
            curveTo(11.605f, 21f, 12.07f, 21f, 13f, 21f)
            horizontalLineTo(15f)
            curveTo(17.8284f, 21f, 19.2426f, 21f, 20.1213f, 20.1213f)
            curveTo(21f, 19.2426f, 21f, 17.8284f, 21f, 15f)
            verticalLineTo(12f)
            curveTo(21f, 10.3431f, 19.6569f, 9f, 18f, 9f)
        }
        }.build()

        return _squaresExclude!!
    }

private var _squaresExclude: ImageVector? = null
