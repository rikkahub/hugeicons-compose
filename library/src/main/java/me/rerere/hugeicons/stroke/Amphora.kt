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

val HugeIcons.Amphora: ImageVector
    get() {
        if (_amphora != null) {
            return _amphora!!
        }
        _amphora = ImageVector.Builder(
            name = "Amphora",
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
            moveTo(14.5f, 9f)
            curveTo(14.5f, 5.5f, 16.5f, 3.83333f, 16.5f, 3f)
            curveTo(16.5f, 2.44772f, 16.0523f, 2f, 15.5f, 2f)
            horizontalLineTo(8.5f)
            curveTo(7.94772f, 2f, 7.5f, 2.44772f, 7.5f, 3f)
            curveTo(7.5f, 3.83333f, 9.5f, 5.5f, 9.5f, 9f)
            curveTo(9.5f, 12.5f, 6f, 13f, 6f, 16f)
            curveTo(6f, 16.7606f, 6.19285f, 17.5936f, 6.46853f, 18.4163f)
            curveTo(7.01669f, 20.0522f, 7.29077f, 20.8702f, 8.07582f, 21.4351f)
            curveTo(8.86088f, 22f, 9.87366f, 22f, 11.8992f, 22f)
            horizontalLineTo(12.1008f)
            curveTo(14.1263f, 22f, 15.1391f, 22f, 15.9242f, 21.4351f)
            curveTo(16.7092f, 20.8702f, 16.9833f, 20.0522f, 17.5315f, 18.4163f)
            curveTo(17.8072f, 17.5936f, 18f, 16.7606f, 18f, 16f)
            curveTo(18f, 13f, 14.5f, 12.5f, 14.5f, 9f)
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
            moveTo(9f, 6f)
            horizontalLineTo(15f)
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
            moveTo(16.5f, 4f)
            horizontalLineTo(17.6207f)
            curveTo(18.3825f, 4f, 19f, 4.6175f, 19f, 5.37924f)
            curveTo(19f, 5.45959f, 18.9929f, 5.53979f, 18.979f, 5.61893f)
            lineTo(17.5f, 14f)
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
            moveTo(7.50006f, 4f)
            horizontalLineTo(6.37924f)
            curveTo(5.6175f, 4f, 5f, 4.6175f, 5f, 5.37924f)
            curveTo(5f, 5.45959f, 5.00702f, 5.53979f, 5.02099f, 5.61893f)
            lineTo(6.5f, 14f)
        }
        }.build()

        return _amphora!!
    }

private var _amphora: ImageVector? = null
