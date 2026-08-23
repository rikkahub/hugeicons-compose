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

val HugeIcons.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) {
            return _hardDrive!!
        }
        _hardDrive = ImageVector.Builder(
            name = "HardDrive",
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
            moveTo(20.7104f, 8.70122f)
            lineTo(21.9186f, 12.7288f)
            curveTo(21.9578f, 12.8592f, 21.9773f, 12.9244f, 21.9879f, 12.9914f)
            lineTo(21.9908f, 13.0118f)
            curveTo(22f, 13.079f, 22f, 13.147f, 22f, 13.2831f)
            curveTo(22f, 16.7797f, 22f, 18.528f, 20.9812f, 19.6669f)
            curveTo(20.8824f, 19.7774f, 20.7774f, 19.8824f, 20.6669f, 19.9812f)
            curveTo(19.528f, 21f, 17.7797f, 21f, 14.2831f, 21f)
            horizontalLineTo(9.71685f)
            curveTo(6.22026f, 21f, 4.47197f, 21f, 3.33311f, 19.9812f)
            curveTo(3.22259f, 19.8824f, 3.11765f, 19.7774f, 3.01877f, 19.6669f)
            curveTo(2f, 18.528f, 2f, 16.7797f, 2f, 13.2831f)
            curveTo(2f, 13.147f, 2f, 13.079f, 2.00915f, 13.0118f)
            lineTo(2.01215f, 12.9914f)
            curveTo(2.02269f, 12.9244f, 2.04225f, 12.8592f, 2.08136f, 12.7288f)
            lineTo(3.28963f, 8.70122f)
            curveTo(4.11355f, 5.95484f, 4.5255f, 4.58166f, 5.5884f, 3.79083f)
            curveTo(6.6513f, 3f, 8.08495f, 3f, 10.9522f, 3f)
            horizontalLineTo(13.0478f)
            curveTo(15.9151f, 3f, 17.3487f, 3f, 18.4116f, 3.79083f)
            curveTo(19.4745f, 4.58166f, 19.8865f, 5.95484f, 20.7104f, 8.70122f)
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
            moveTo(2f, 13f)
            horizontalLineTo(22f)
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
            moveTo(18.125f, 17f)
            horizontalLineTo(18f)
            moveTo(14.125f, 17f)
            horizontalLineTo(14f)
            moveTo(18.25f, 17f)
            curveTo(18.25f, 17.1381f, 18.1381f, 17.25f, 18f, 17.25f)
            curveTo(17.8619f, 17.25f, 17.75f, 17.1381f, 17.75f, 17f)
            curveTo(17.75f, 16.8619f, 17.8619f, 16.75f, 18f, 16.75f)
            curveTo(18.1381f, 16.75f, 18.25f, 16.8619f, 18.25f, 17f)
            close()
            moveTo(14.25f, 17f)
            curveTo(14.25f, 17.1381f, 14.1381f, 17.25f, 14f, 17.25f)
            curveTo(13.8619f, 17.25f, 13.75f, 17.1381f, 13.75f, 17f)
            curveTo(13.75f, 16.8619f, 13.8619f, 16.75f, 14f, 16.75f)
            curveTo(14.1381f, 16.75f, 14.25f, 16.8619f, 14.25f, 17f)
            close()
        }
        }.build()

        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
