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

val HugeIcons.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) {
            return _chessKnight!!
        }
        _chessKnight = ImageVector.Builder(
            name = "ChessKnight",
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
            moveTo(16.5f, 22f)
            horizontalLineTo(6.5f)
            curveTo(6.03501f, 22f, 5.80252f, 22f, 5.61177f, 21.9489f)
            curveTo(5.09413f, 21.8102f, 4.68981f, 21.4059f, 4.55111f, 20.8882f)
            curveTo(4.5f, 20.6975f, 4.5f, 20.465f, 4.5f, 20f)
            curveTo(4.5f, 18.8954f, 5.39543f, 18f, 6.5f, 18f)
            horizontalLineTo(16.5f)
            curveTo(17.6046f, 18f, 18.5f, 18.8954f, 18.5f, 20f)
            curveTo(18.5f, 20.465f, 18.5f, 20.6975f, 18.4489f, 20.8882f)
            curveTo(18.3102f, 21.4059f, 17.9059f, 21.8102f, 17.3882f, 21.9489f)
            curveTo(17.1975f, 22f, 16.965f, 22f, 16.5f, 22f)
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
            moveTo(16.5412f, 18f)
            lineTo(18.6065f, 12.5989f)
            curveTo(18.9952f, 11.5824f, 19.1895f, 11.0741f, 19.2894f, 10.6776f)
            curveTo(20.3197f, 6.58681f, 17.4559f, 2.53744f, 13.1858f, 2.04748f)
            curveTo(12.772f, 2f, 12.2181f, 2f, 11.1105f, 2f)
            curveTo(10.9388f, 2f, 10.8529f, 2f, 10.7806f, 2.00675f)
            curveTo(10.05f, 2.0749f, 9.47154f, 2.6418f, 9.402f, 3.35789f)
            curveTo(9.39512f, 3.42878f, 9.39512f, 3.51293f, 9.39512f, 3.68122f)
            verticalLineTo(4.5f)
            lineTo(5.28271f, 6.91832f)
            curveTo(5.00991f, 7.07874f, 4.87351f, 7.15895f, 4.77626f, 7.26052f)
            curveTo(4.58792f, 7.45725f, 4.48866f, 7.72022f, 4.50103f, 7.98973f)
            curveTo(4.50742f, 8.12887f, 4.55772f, 8.27677f, 4.65832f, 8.57257f)
            curveTo(4.84057f, 9.10842f, 4.93169f, 9.37635f, 5.07488f, 9.59175f)
            curveTo(5.35194f, 10.0085f, 5.77752f, 10.3092f, 6.26857f, 10.435f)
            curveTo(6.52235f, 10.5f, 6.81051f, 10.5f, 7.38682f, 10.5f)
            horizontalLineTo(10.1768f)
            curveTo(10.5512f, 10.5f, 10.7384f, 10.5f, 10.9111f, 10.4807f)
            curveTo(11.8188f, 10.3793f, 12.6328f, 9.88594f, 13.1308f, 9.13532f)
            curveTo(13.2255f, 8.99249f, 13.3092f, 8.82829f, 13.4764f, 8.5f)
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
            moveTo(6.5f, 18f)
            curveTo(6.5f, 17.8188f, 6.5f, 17.7283f, 6.50377f, 17.6415f)
            curveTo(6.54858f, 16.6096f, 6.9908f, 15.6351f, 7.73785f, 14.9219f)
            curveTo(7.80064f, 14.8619f, 7.86882f, 14.8023f, 8.00515f, 14.683f)
            lineTo(8.99485f, 13.817f)
            curveTo(9.13117f, 13.6977f, 9.19936f, 13.6381f, 9.26215f, 13.5781f)
            curveTo(10.0092f, 12.8649f, 10.4514f, 11.8904f, 10.4962f, 10.8585f)
            curveTo(10.5f, 10.7717f, 10.5f, 10.6812f, 10.5f, 10.5f)
        }
        }.build()

        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
