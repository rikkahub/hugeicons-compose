package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = ImageVector.Builder(
            name = "FlipHorizontal",
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
        moveTo(6.29516f, 14.4204f)
        curveTo(7.65364f, 13.4668f, 8.33288f, 12.99f, 8.46522f, 12.3436f)
        curveTo(8.51159f, 12.1172f, 8.51159f, 11.8828f, 8.46522f, 11.6563f)
        curveTo(8.33288f, 11.01f, 7.65364f, 10.5332f, 6.29516f, 9.57959f)
        curveTo(4.65002f, 8.42475f, 3.82745f, 7.84734f, 3.15323f, 8.03482f)
        curveTo(2.91938f, 8.09984f, 2.70324f, 8.22164f, 2.52214f, 8.39045f)
        curveTo(2f, 8.87715f, 2f, 9.9181f, 2f, 12f)
        curveTo(2f, 14.0819f, 2f, 15.1229f, 2.52214f, 15.6096f)
        curveTo(2.70324f, 15.7784f, 2.91938f, 15.9002f, 3.15323f, 15.9652f)
        curveTo(3.82745f, 16.1527f, 4.65003f, 15.5752f, 6.29516f, 14.4204f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.7048f, 9.57959f)
        curveTo(16.3464f, 10.5332f, 15.6671f, 11.01f, 15.5348f, 11.6564f)
        curveTo(15.4884f, 11.8828f, 15.4884f, 12.1172f, 15.5348f, 12.3436f)
        curveTo(15.6671f, 12.99f, 16.3464f, 13.4668f, 17.7048f, 14.4204f)
        curveTo(19.35f, 15.5752f, 20.1725f, 16.1527f, 20.8468f, 15.9652f)
        curveTo(21.0806f, 15.9002f, 21.2968f, 15.7784f, 21.4779f, 15.6096f)
        curveTo(22f, 15.1229f, 22f, 14.0819f, 22f, 12f)
        curveTo(22f, 9.9181f, 22f, 8.87715f, 21.4779f, 8.39045f)
        curveTo(21.2968f, 8.22164f, 21.0806f, 8.09984f, 20.8468f, 8.03482f)
        curveTo(20.1725f, 7.84734f, 19.35f, 8.42476f, 17.7048f, 9.57959f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 14f)
        verticalLineTo(10f)
        moveTo(12f, 6.5f)
        verticalLineTo(3f)
        moveTo(12f, 21f)
        verticalLineTo(17.5f)
        }
        }.build()

        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
