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

val HugeIcons.SquareStop: ImageVector
    get() {
        if (_squareStop != null) {
            return _squareStop!!
        }
        _squareStop = ImageVector.Builder(
            name = "SquareStop",
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
            moveTo(2.49219f, 12f)
            curveTo(2.49219f, 7.52166f, 2.49219f, 5.28249f, 3.88343f, 3.89124f)
            curveTo(5.27467f, 2.5f, 7.51384f, 2.5f, 11.9922f, 2.5f)
            curveTo(16.4705f, 2.5f, 18.7097f, 2.5f, 20.1009f, 3.89124f)
            curveTo(21.4922f, 5.28249f, 21.4922f, 7.52166f, 21.4922f, 12f)
            curveTo(21.4922f, 16.4783f, 21.4922f, 18.7175f, 20.1009f, 20.1088f)
            curveTo(18.7097f, 21.5f, 16.4705f, 21.5f, 11.9922f, 21.5f)
            curveTo(7.51384f, 21.5f, 5.27467f, 21.5f, 3.88343f, 20.1088f)
            curveTo(2.49219f, 18.7175f, 2.49219f, 16.4783f, 2.49219f, 12f)
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
            moveTo(9.38105f, 15.1629f)
            curveTo(9.88549f, 15.5f, 10.5877f, 15.5f, 11.9922f, 15.5f)
            curveTo(13.3967f, 15.5f, 14.0989f, 15.5f, 14.6033f, 15.1629f)
            curveTo(14.8217f, 15.017f, 15.0092f, 14.8295f, 15.1551f, 14.6111f)
            curveTo(15.4922f, 14.1067f, 15.4922f, 13.4045f, 15.4922f, 12f)
            curveTo(15.4922f, 10.5955f, 15.4922f, 9.89331f, 15.1551f, 9.38886f)
            curveTo(15.0092f, 9.17048f, 14.8217f, 8.98298f, 14.6033f, 8.83706f)
            curveTo(14.0989f, 8.5f, 13.3967f, 8.5f, 11.9922f, 8.5f)
            curveTo(10.5877f, 8.5f, 9.88549f, 8.5f, 9.38105f, 8.83706f)
            curveTo(9.16267f, 8.98298f, 8.97517f, 9.17048f, 8.82925f, 9.38886f)
            curveTo(8.49219f, 9.89331f, 8.49219f, 10.5955f, 8.49219f, 12f)
            curveTo(8.49219f, 13.4045f, 8.49219f, 14.1067f, 8.82925f, 14.6111f)
            curveTo(8.97517f, 14.8295f, 9.16267f, 15.017f, 9.38105f, 15.1629f)
            close()
        }
        }.build()

        return _squareStop!!
    }

private var _squareStop: ImageVector? = null
