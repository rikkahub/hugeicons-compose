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

val HugeIcons.Droplets: ImageVector
    get() {
        if (_droplets != null) {
            return _droplets!!
        }
        _droplets = ImageVector.Builder(
            name = "Droplets",
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
            moveTo(16f, 18.3353f)
            curveTo(14.7182f, 19.958f, 12.731f, 20.9998f, 10.5f, 20.9998f)
            curveTo(6.63401f, 20.9998f, 3.5f, 17.8716f, 3.5f, 14.0128f)
            curveTo(3.5f, 10.7825f, 6.4327f, 6.71588f, 8.50161f, 4.24893f)
            curveTo(8.99925f, 3.65554f, 9.24808f, 3.35884f, 9.64473f, 3.17154f)
            curveTo(10.1298f, 2.94248f, 10.8704f, 2.9425f, 11.3554f, 3.17159f)
            curveTo(11.7521f, 3.35892f, 12.0014f, 3.65623f, 12.5f, 4.25084f)
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
            moveTo(17f, 15.033f)
            curveTo(18.933f, 15.033f, 20.5f, 13.3836f, 20.5f, 11.3488f)
            curveTo(20.5f, 10.4274f, 20.0709f, 9.37701f, 19.5133f, 8.40085f)
            curveTo(18.6116f, 6.82258f, 18.1608f, 6.03345f, 17f, 6.03345f)
            curveTo(15.8392f, 6.03345f, 15.3884f, 6.82258f, 14.4867f, 8.40085f)
            curveTo(13.9291f, 9.37701f, 13.5f, 10.4274f, 13.5f, 11.3488f)
            curveTo(13.5f, 13.3836f, 15.067f, 15.033f, 17f, 15.033f)
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
            moveTo(10.5f, 17.033f)
            curveTo(8.84315f, 17.033f, 7.5f, 15.6898f, 7.5f, 14.033f)
        }
        }.build()

        return _droplets!!
    }

private var _droplets: ImageVector? = null
