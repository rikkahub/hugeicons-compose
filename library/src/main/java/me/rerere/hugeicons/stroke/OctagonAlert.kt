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

val HugeIcons.OctagonAlert: ImageVector
    get() {
        if (_octagonAlert != null) {
            return _octagonAlert!!
        }
        _octagonAlert = ImageVector.Builder(
            name = "OctagonAlert",
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
            moveTo(11.9922f, 8f)
            lineTo(11.9922f, 12f)
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
            moveTo(12.1172f, 15.75f)
            lineTo(11.9922f, 15.75f)
            moveTo(12.2422f, 15.75f)
            curveTo(12.2422f, 15.8881f, 12.1303f, 16f, 11.9922f, 16f)
            curveTo(11.8541f, 16f, 11.7422f, 15.8881f, 11.7422f, 15.75f)
            curveTo(11.7422f, 15.6119f, 11.8541f, 15.5f, 11.9922f, 15.5f)
            curveTo(12.1303f, 15.5f, 12.2422f, 15.6119f, 12.2422f, 15.75f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.5067f, 2f)
            curveTo(14.733f, 2f, 15.3461f, 2f, 15.8974f, 2.22836f)
            curveTo(16.4487f, 2.45672f, 16.8823f, 2.89027f, 17.7494f, 3.75736f)
            lineTo(20.2346f, 6.24264f)
            curveTo(21.1017f, 7.10973f, 21.5353f, 7.54328f, 21.7636f, 8.09459f)
            curveTo(21.992f, 8.6459f, 21.992f, 9.25903f, 21.992f, 10.4853f)
            verticalLineTo(13.5147f)
            curveTo(21.992f, 14.741f, 21.992f, 15.3541f, 21.7636f, 15.9054f)
            curveTo(21.5353f, 16.4567f, 21.1017f, 16.8903f, 20.2346f, 17.7574f)
            lineTo(17.7494f, 20.2426f)
            curveTo(16.8823f, 21.1097f, 16.4487f, 21.5433f, 15.8974f, 21.7716f)
            curveTo(15.3461f, 22f, 14.733f, 22f, 13.5067f, 22f)
            horizontalLineTo(10.4773f)
            curveTo(9.25105f, 22f, 8.63792f, 22f, 8.08659f, 21.7716f)
            curveTo(7.53527f, 21.5433f, 7.10172f, 21.1097f, 6.23462f, 20.2426f)
            lineTo(3.74948f, 17.7573f)
            curveTo(2.88242f, 16.8903f, 2.44889f, 16.4567f, 2.22054f, 15.9054f)
            curveTo(1.99219f, 15.3541f, 1.99219f, 14.741f, 1.99219f, 13.5148f)
            verticalLineTo(10.4852f)
            curveTo(1.99219f, 9.259f, 1.99219f, 8.64589f, 2.22054f, 8.09458f)
            curveTo(2.44889f, 7.54328f, 2.88242f, 7.10974f, 3.74948f, 6.24265f)
            lineTo(6.23463f, 3.75743f)
            curveTo(7.10172f, 2.8903f, 7.53527f, 2.45674f, 8.08659f, 2.22837f)
            curveTo(8.63792f, 2f, 9.25105f, 2f, 10.4773f, 2f)
            horizontalLineTo(13.5067f)
            close()
        }
        }.build()

        return _octagonAlert!!
    }

private var _octagonAlert: ImageVector? = null
