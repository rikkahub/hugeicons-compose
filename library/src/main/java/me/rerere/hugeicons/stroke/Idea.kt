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

val HugeIcons.Idea: ImageVector
    get() {
        if (_idea != null) {
            return _idea!!
        }
        _idea = ImageVector.Builder(
            name = "Idea",
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
            moveTo(14.9998f, 17.75f)
            horizontalLineTo(8.99982f)
            verticalLineTo(18.75f)
            curveTo(8.99982f, 20.4069f, 10.343f, 21.75f, 11.9998f, 21.75f)
            curveTo(13.6567f, 21.75f, 14.9998f, 20.4069f, 14.9998f, 18.75f)
            verticalLineTo(17.75f)
            close()
        }

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
            moveTo(16.7278f, 13.9223f)
            curveTo(17.7019f, 12.7372f, 18.4999f, 11.2841f, 18.4999f, 9.25f)
            curveTo(18.4999f, 5.39531f, 15.8659f, 2.25f, 11.9999f, 2.25f)
            curveTo(8.13395f, 2.25f, 5.49994f, 5.39531f, 5.49994f, 9.25f)
            curveTo(5.49994f, 11.553f, 6.52285f, 13.1112f, 7.66608f, 14.3788f)
            curveTo(8.10619f, 14.8668f, 8.32624f, 15.1108f, 8.44739f, 15.3519f)
            curveTo(8.56855f, 15.593f, 8.62453f, 15.8729f, 8.73649f, 16.4327f)
            lineTo(8.99994f, 17.75f)
            horizontalLineTo(14.9999f)
            lineTo(15.1451f, 17.0241f)
            curveTo(15.3026f, 16.2369f, 15.3813f, 15.8432f, 15.5397f, 15.5091f)
            curveTo(15.6981f, 15.1749f, 16.0414f, 14.7574f, 16.7278f, 13.9223f)
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
            moveTo(11.0011f, 5.39935f)
            curveTo(9.74194f, 5.78703f, 8.77971f, 6.88805f, 8.55237f, 8.24942f)
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
            moveTo(21.4989f, 13.6115f)
            lineTo(20.7854f, 13.3181f)
            moveTo(21.4988f, 3.31989f)
            lineTo(20.7852f, 3.61319f)
            moveTo(2.5011f, 13.7486f)
            lineTo(3.21463f, 13.4553f)
            moveTo(2.50122f, 3.45705f)
            lineTo(3.21476f, 3.75035f)
        }
        }.build()

        return _idea!!
    }

private var _idea: ImageVector? = null
