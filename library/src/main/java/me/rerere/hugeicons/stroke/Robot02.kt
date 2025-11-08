package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Robot02: ImageVector
    get() {
        if (_robot02 != null) {
            return _robot02!!
        }
        _robot02 = ImageVector.Builder(
            name = "Robot02",
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
        moveTo(4f, 16f)
        curveTo(4f, 11.5817f, 7.58172f, 8f, 12f, 8f)
        curveTo(16.4183f, 8f, 20f, 11.5817f, 20f, 16f)
        verticalLineTo(18.1818f)
        curveTo(20f, 18.9423f, 20f, 19.3225f, 19.9314f, 19.6377f)
        curveTo(19.6818f, 20.7854f, 18.7854f, 21.6818f, 17.6377f, 21.9314f)
        curveTo(17.3225f, 22f, 16.9423f, 22f, 16.1818f, 22f)
        horizontalLineTo(7.81818f)
        curveTo(7.05771f, 22f, 6.67747f, 22f, 6.3623f, 21.9314f)
        curveTo(5.21464f, 21.6818f, 4.31822f, 20.7854f, 4.06856f, 19.6377f)
        curveTo(4f, 19.3225f, 4f, 18.9423f, 4f, 18.1818f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 13f)
        verticalLineTo(14f)
        moveTo(15f, 13f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 18.5f)
        horizontalLineTo(8.09861f)
        curveTo(8.66175f, 18.5f, 9.18763f, 18.2186f, 9.5f, 17.75f)
        curveTo(9.81237f, 17.2814f, 10.3383f, 17f, 10.9014f, 17f)
        horizontalLineTo(13.0986f)
        curveTo(13.6617f, 17f, 14.1876f, 17.2814f, 14.5f, 17.75f)
        curveTo(14.8124f, 18.2186f, 15.3383f, 18.5f, 15.9014f, 18.5f)
        horizontalLineTo(20f)
        }
        }.build()

        return _robot02!!
    }

private var _robot02: ImageVector? = null
