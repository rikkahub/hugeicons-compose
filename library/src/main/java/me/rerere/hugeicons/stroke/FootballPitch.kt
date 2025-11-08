package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FootballPitch: ImageVector
    get() {
        if (_footballPitch != null) {
            return _footballPitch!!
        }
        _footballPitch = ImageVector.Builder(
            name = "FootballPitch",
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
        moveTo(2f, 8.57143f)
        curveTo(2f, 6.41644f, 2f, 5.33894f, 2.58579f, 4.66947f)
        curveTo(3.17157f, 4f, 4.11438f, 4f, 6f, 4f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 4f, 20.8284f, 4f, 21.4142f, 4.66947f)
        curveTo(22f, 5.33894f, 22f, 6.41644f, 22f, 8.57143f)
        verticalLineTo(15.4286f)
        curveTo(22f, 17.5836f, 22f, 18.6611f, 21.4142f, 19.3305f)
        curveTo(20.8284f, 20f, 19.8856f, 20f, 18f, 20f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 20f, 3.17157f, 20f, 2.58579f, 19.3305f)
        curveTo(2f, 18.6611f, 2f, 17.5836f, 2f, 15.4286f)
        verticalLineTo(8.57143f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        verticalLineTo(5f)
        moveTo(12f, 14f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 9f)
        horizontalLineTo(19.5f)
        curveTo(18.9477f, 9f, 18.5f, 9.44772f, 18.5f, 10f)
        verticalLineTo(14f)
        curveTo(18.5f, 14.5523f, 18.9477f, 15f, 19.5f, 15f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9f)
        horizontalLineTo(4.5f)
        curveTo(5.05228f, 9f, 5.5f, 9.44772f, 5.5f, 10f)
        verticalLineTo(14f)
        curveTo(5.5f, 14.5523f, 5.05228f, 15f, 4.5f, 15f)
        horizontalLineTo(2f)
        }
        }.build()

        return _footballPitch!!
    }

private var _footballPitch: ImageVector? = null
