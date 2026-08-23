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

val HugeIcons.GlobeLock: ImageVector
    get() {
        if (_globeLock != null) {
            return _globeLock!!
        }
        _globeLock = ImageVector.Builder(
            name = "GlobeLock",
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
            curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
            curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
            curveTo(16.8379f, 2f, 20.8734f, 5.43552f, 21.8f, 10f)
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
            moveTo(12f, 22f)
            curveTo(9.79086f, 22f, 8f, 17.5228f, 8f, 12f)
            curveTo(8f, 6.47715f, 9.79086f, 2f, 12f, 2f)
            curveTo(13.9352f, 2f, 15.5494f, 5.43552f, 15.92f, 10f)
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
            moveTo(12f, 12f)
            lineTo(2f, 12f)
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
            moveTo(20.5f, 16.5f)
            verticalLineTo(15f)
            curveTo(20.5f, 13.8954f, 19.6046f, 13f, 18.5f, 13f)
            curveTo(17.3954f, 13f, 16.5f, 13.8954f, 16.5f, 15f)
            verticalLineTo(16.5f)
            moveTo(20.5f, 16.5f)
            horizontalLineTo(16.5f)
            moveTo(20.5f, 16.5f)
            curveTo(21.3284f, 16.5f, 22f, 17.1716f, 22f, 18f)
            verticalLineTo(18.75f)
            curveTo(22f, 19.4489f, 22f, 19.7984f, 21.8858f, 20.074f)
            curveTo(21.7336f, 20.4416f, 21.4416f, 20.7336f, 21.074f, 20.8858f)
            curveTo(20.7984f, 21f, 20.4489f, 21f, 19.75f, 21f)
            horizontalLineTo(17.25f)
            curveTo(16.5511f, 21f, 16.2016f, 21f, 15.926f, 20.8858f)
            curveTo(15.5584f, 20.7336f, 15.2664f, 20.4416f, 15.1142f, 20.074f)
            curveTo(15f, 19.7984f, 15f, 19.4489f, 15f, 18.75f)
            verticalLineTo(18f)
            curveTo(15f, 17.1716f, 15.6716f, 16.5f, 16.5f, 16.5f)
        }
        }.build()

        return _globeLock!!
    }

private var _globeLock: ImageVector? = null
