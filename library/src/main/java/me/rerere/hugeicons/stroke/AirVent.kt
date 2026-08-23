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

val HugeIcons.AirVent: ImageVector
    get() {
        if (_airVent != null) {
            return _airVent!!
        }
        _airVent = ImageVector.Builder(
            name = "AirVent",
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
            moveTo(6.5f, 3f)
            horizontalLineTo(17.5f)
            curveTo(18.8978f, 3f, 19.5967f, 3f, 20.1481f, 3.22836f)
            curveTo(20.8831f, 3.53284f, 21.4672f, 4.11687f, 21.7716f, 4.85195f)
            curveTo(22f, 5.40326f, 22f, 6.10218f, 22f, 7.5f)
            curveTo(22f, 8.89782f, 22f, 9.59674f, 21.7716f, 10.1481f)
            curveTo(21.4672f, 10.8831f, 20.8831f, 11.4672f, 20.1481f, 11.7716f)
            curveTo(19.5967f, 12f, 18.8978f, 12f, 17.5f, 12f)
            horizontalLineTo(6.5f)
            curveTo(5.10218f, 12f, 4.40326f, 12f, 3.85195f, 11.7716f)
            curveTo(3.11687f, 11.4672f, 2.53284f, 10.8831f, 2.22836f, 10.1481f)
            curveTo(2f, 9.59674f, 2f, 8.89782f, 2f, 7.5f)
            curveTo(2f, 6.10218f, 2f, 5.40326f, 2.22836f, 4.85195f)
            curveTo(2.53284f, 4.11687f, 3.11687f, 3.53284f, 3.85195f, 3.22836f)
            curveTo(4.40326f, 3f, 5.10218f, 3f, 6.5f, 3f)
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
            moveTo(18f, 12f)
            curveTo(18f, 10.1144f, 18f, 9.17157f, 17.4142f, 8.58579f)
            curveTo(16.8284f, 8f, 15.8856f, 8f, 14f, 8f)
            horizontalLineTo(10f)
            curveTo(8.11438f, 8f, 7.17157f, 8f, 6.58579f, 8.58579f)
            curveTo(6f, 9.17157f, 6f, 10.1144f, 6f, 12f)
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
            moveTo(16f, 15f)
            verticalLineTo(19f)
            curveTo(16f, 20.1046f, 16.8954f, 21f, 18f, 21f)
            curveTo(19.1046f, 21f, 20f, 20.1046f, 20f, 19f)
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
            moveTo(8f, 15f)
            verticalLineTo(17f)
            curveTo(8f, 18.1046f, 7.10457f, 19f, 6f, 19f)
            curveTo(4.89543f, 19f, 4f, 18.1046f, 4f, 17f)
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
            moveTo(12f, 15f)
            verticalLineTo(19f)
        }
        }.build()

        return _airVent!!
    }

private var _airVent: ImageVector? = null
