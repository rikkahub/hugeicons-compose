package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) {
            return _flipVertical!!
        }
        _flipVertical = ImageVector.Builder(
            name = "FlipVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.57959f, 6.29516f)
        curveTo(10.5332f, 7.65364f, 11.01f, 8.33288f, 11.6564f, 8.46522f)
        curveTo(11.8828f, 8.51159f, 12.1172f, 8.51159f, 12.3436f, 8.46522f)
        curveTo(12.99f, 8.33288f, 13.4668f, 7.65364f, 14.4204f, 6.29516f)
        curveTo(15.5752f, 4.65002f, 16.1527f, 3.82745f, 15.9652f, 3.15323f)
        curveTo(15.9002f, 2.91938f, 15.7784f, 2.70324f, 15.6096f, 2.52214f)
        curveTo(15.1229f, 2f, 14.0819f, 2f, 12f, 2f)
        curveTo(9.9181f, 2f, 8.87715f, 2f, 8.39045f, 2.52214f)
        curveTo(8.22164f, 2.70324f, 8.09984f, 2.91938f, 8.03482f, 3.15323f)
        curveTo(7.84734f, 3.82745f, 8.42476f, 4.65003f, 9.57959f, 6.29516f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4204f, 17.7048f)
        curveTo(13.4668f, 16.3464f, 12.99f, 15.6671f, 12.3436f, 15.5348f)
        curveTo(12.1172f, 15.4884f, 11.8828f, 15.4884f, 11.6564f, 15.5348f)
        curveTo(11.01f, 15.6671f, 10.5332f, 16.3464f, 9.57959f, 17.7048f)
        curveTo(8.42475f, 19.35f, 7.84734f, 20.1725f, 8.03482f, 20.8468f)
        curveTo(8.09984f, 21.0806f, 8.22164f, 21.2968f, 8.39045f, 21.4779f)
        curveTo(8.87715f, 22f, 9.9181f, 22f, 12f, 22f)
        curveTo(14.0819f, 22f, 15.1229f, 22f, 15.6095f, 21.4779f)
        curveTo(15.7784f, 21.2968f, 15.9002f, 21.0806f, 15.9652f, 20.8468f)
        curveTo(16.1527f, 20.1725f, 15.5752f, 19.35f, 14.4204f, 17.7048f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 12f)
        horizontalLineTo(14f)
        moveTo(17.5f, 12f)
        horizontalLineTo(21f)
        moveTo(3f, 12f)
        horizontalLineTo(6.5f)
        }
        }.build()

        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
