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

val HugeIcons.BodyWeight: ImageVector
    get() {
        if (_bodyWeight != null) {
            return _bodyWeight!!
        }
        _bodyWeight = ImageVector.Builder(
            name = "BodyWeight",
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
            moveTo(12.0018f, 14.0034f)
            verticalLineTo(12.3621f)
            moveTo(12.0018f, 14.0034f)
            curveTo(13.6684f, 14.0034f, 15.3351f, 13.8212f, 17.0018f, 13.4565f)
            curveTo(18.2762f, 13.1776f, 19.5506f, 12.7916f, 20.825f, 12.2995f)
            curveTo(21.2154f, 12.1487f, 21.6568f, 12.0141f, 21.8658f, 11.6217f)
            curveTo(22.0018f, 11.3663f, 22.0018f, 11.0571f, 22.0018f, 10.4387f)
            curveTo(22.0018f, 9.20572f, 22.0018f, 7.58804f, 21.701f, 7.26609f)
            curveTo(21.1315f, 6.65661f, 20.0444f, 7.21761f, 19.4122f, 7.42272f)
            curveTo(14.4719f, 9.02529f, 9.53162f, 9.02529f, 4.59137f, 7.42272f)
            curveTo(3.95909f, 7.21761f, 2.872f, 6.65661f, 2.30254f, 7.26609f)
            curveTo(2.00174f, 7.58804f, 2.00174f, 9.20572f, 2.00174f, 10.4387f)
            curveTo(2.00174f, 10.8841f, 1.94932f, 11.4049f, 2.23938f, 11.7788f)
            curveTo(2.4142f, 12.0042f, 2.66898f, 12.1026f, 3.17854f, 12.2995f)
            curveTo(4.45343f, 12.7918f, 5.72831f, 13.1776f, 7.0032f, 13.4565f)
            curveTo(8.66938f, 13.821f, 10.3356f, 14.0034f, 12.0018f, 14.0034f)
            close()
            moveTo(7.0032f, 13.4565f)
            lineTo(7.00174f, 11.8149f)
            moveTo(17.0018f, 13.4565f)
            verticalLineTo(11.8149f)
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
            moveTo(19.002f, 19.0096f)
            curveTo(14.3353f, 20.3458f, 9.66862f, 20.3458f, 5.00195f, 19.0096f)
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
            moveTo(19.191f, 2.99805f)
            curveTo(18.6141f, 4.30938f, 18.0839f, 6.55739f, 18.0839f, 7.58772f)
            moveTo(4.81544f, 2.99805f)
            curveTo(5.39237f, 4.30938f, 5.92253f, 6.55739f, 5.92253f, 7.58772f)
            moveTo(5.39913f, 15.5107f)
            curveTo(4.96029f, 16.8915f, 3.80051f, 19.6218f, 4.00426f, 21.0026f)
            moveTo(18.6142f, 15.5107f)
            curveTo(19.0531f, 16.8915f, 20.2129f, 19.6218f, 20.0091f, 21.0026f)
        }
        }.build()

        return _bodyWeight!!
    }

private var _bodyWeight: ImageVector? = null
