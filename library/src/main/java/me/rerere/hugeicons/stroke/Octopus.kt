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

val HugeIcons.Octopus: ImageVector
    get() {
        if (_octopus != null) {
            return _octopus!!
        }
        _octopus = ImageVector.Builder(
            name = "Octopus",
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
            moveTo(16.0925f, 13f)
            curveTo(17.2309f, 12.0981f, 18f, 10.8493f, 18f, 9.46931f)
            curveTo(18f, 6.71919f, 14.9455f, 2f, 12f, 2f)
            curveTo(9.05448f, 2f, 6f, 6.71919f, 6f, 9.46931f)
            curveTo(6f, 10.8493f, 6.76907f, 12.0981f, 7.90754f, 13f)
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
            moveTo(13.5f, 14f)
            curveTo(13.0164f, 18f, 13.8997f, 19.7143f, 17f, 22f)
            moveTo(10.5f, 14f)
            curveTo(10.9836f, 18f, 10.1002f, 19.7143f, 7f, 22f)
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
            moveTo(13.5f, 14f)
            curveTo(14.5f, 16f, 17.0791f, 18.5f, 19.0475f, 18.5f)
            curveTo(21.0158f, 18.5f, 22f, 17.2688f, 22f, 15.75f)
            curveTo(22f, 14.2312f, 20.8984f, 13f, 19.5396f, 13f)
            moveTo(10.5f, 14f)
            curveTo(9.5f, 16f, 6.92082f, 18.5f, 4.95249f, 18.5f)
            curveTo(2.98416f, 18.5f, 2f, 17.2688f, 2f, 15.75f)
            curveTo(2f, 14.2312f, 3.10156f, 13f, 4.46041f, 13f)
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
            moveTo(10.125f, 10f)
            horizontalLineTo(10f)
            moveTo(10.25f, 10f)
            curveTo(10.25f, 10.1381f, 10.1381f, 10.25f, 10f, 10.25f)
            curveTo(9.86193f, 10.25f, 9.75f, 10.1381f, 9.75f, 10f)
            curveTo(9.75f, 9.86193f, 9.86193f, 9.75f, 10f, 9.75f)
            curveTo(10.1381f, 9.75f, 10.25f, 9.86193f, 10.25f, 10f)
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
            moveTo(14.125f, 10f)
            horizontalLineTo(14f)
            moveTo(14.25f, 10f)
            curveTo(14.25f, 10.1381f, 14.1381f, 10.25f, 14f, 10.25f)
            curveTo(13.8619f, 10.25f, 13.75f, 10.1381f, 13.75f, 10f)
            curveTo(13.75f, 9.86193f, 13.8619f, 9.75f, 14f, 9.75f)
            curveTo(14.1381f, 9.75f, 14.25f, 9.86193f, 14.25f, 10f)
            close()
        }
        }.build()

        return _octopus!!
    }

private var _octopus: ImageVector? = null
