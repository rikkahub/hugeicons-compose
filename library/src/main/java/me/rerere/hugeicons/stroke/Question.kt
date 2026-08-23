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

val HugeIcons.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = ImageVector.Builder(
            name = "Question",
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
            moveTo(15.4f, 7.49944f)
            horizontalLineTo(15.35f)
            moveTo(18.7f, 7.4996f)
            horizontalLineTo(18.65f)
            moveTo(15.45f, 7.49944f)
            curveTo(15.45f, 7.55467f, 15.4052f, 7.59944f, 15.35f, 7.59944f)
            curveTo(15.2948f, 7.59944f, 15.25f, 7.55467f, 15.25f, 7.49944f)
            curveTo(15.25f, 7.44422f, 15.2948f, 7.39944f, 15.35f, 7.39944f)
            curveTo(15.4052f, 7.39944f, 15.45f, 7.44422f, 15.45f, 7.49944f)
            close()
            moveTo(18.75f, 7.4996f)
            curveTo(18.75f, 7.55483f, 18.7052f, 7.5996f, 18.65f, 7.5996f)
            curveTo(18.5948f, 7.5996f, 18.55f, 7.55483f, 18.55f, 7.4996f)
            curveTo(18.55f, 7.44437f, 18.5948f, 7.3996f, 18.65f, 7.3996f)
            curveTo(18.7052f, 7.3996f, 18.75f, 7.44437f, 18.75f, 7.4996f)
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
            moveTo(17f, 12.5667f)
            curveTo(19.7611f, 12.5667f, 22f, 10.425f, 22f, 7.78339f)
            curveTo(22f, 5.14181f, 19.7611f, 3.00003f, 17f, 3.00003f)
            curveTo(14.2389f, 3.00003f, 12f, 5.14181f, 12f, 7.78339f)
            curveTo(12f, 9.05257f, 12.5167f, 10.2058f, 13.3594f, 11.0616f)
            curveTo(13.545f, 11.25f, 13.6689f, 11.5074f, 13.6189f, 11.7724f)
            curveTo(13.5364f, 12.2056f, 13.3494f, 12.6097f, 13.0756f, 12.9465f)
            curveTo(13.796f, 13.0805f, 14.5451f, 12.9598f, 15.1875f, 12.6182f)
            lineTo(15.1881f, 12.6179f)
            curveTo(15.4148f, 12.4973f, 15.5282f, 12.437f, 15.6083f, 12.4248f)
            curveTo(15.6884f, 12.4126f, 15.8032f, 12.4341f, 16.0327f, 12.4772f)
            curveTo(16.3516f, 12.5371f, 16.6753f, 12.5671f, 17f, 12.5667f)
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
            moveTo(10f, 13f)
            curveTo(10f, 14.6569f, 8.65685f, 16f, 7f, 16f)
            curveTo(5.34315f, 16f, 4f, 14.6569f, 4f, 13f)
            curveTo(4f, 11.3432f, 5.34315f, 10f, 7f, 10f)
            curveTo(8.65685f, 10f, 10f, 11.3432f, 10f, 13f)
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
            moveTo(12f, 21f)
            curveTo(12f, 18.2386f, 9.76142f, 16f, 7f, 16f)
            curveTo(4.23858f, 16f, 2f, 18.2386f, 2f, 21f)
        }
        }.build()

        return _question!!
    }

private var _question: ImageVector? = null
