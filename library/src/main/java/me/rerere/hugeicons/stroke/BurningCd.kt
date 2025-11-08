package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BurningCd: ImageVector
    get() {
        if (_burningCd != null) {
            return _burningCd!!
        }
        _burningCd = ImageVector.Builder(
            name = "BurningCd",
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
        moveTo(15f, 16.5f)
        curveTo(15f, 18.8456f, 15f, 20.0184f, 14.3237f, 20.8263f)
        curveTo(14.1496f, 21.0343f, 13.9465f, 21.2205f, 13.7196f, 21.3801f)
        curveTo(12.8382f, 22f, 11.5588f, 22f, 9f, 22f)
        curveTo(6.44119f, 22f, 5.16178f, 22f, 4.28042f, 21.3801f)
        curveTo(4.05351f, 21.2205f, 3.85041f, 21.0343f, 3.6763f, 20.8263f)
        curveTo(3f, 20.0184f, 3f, 18.8456f, 3f, 16.5f)
        lineTo(3f, 7.5f)
        curveTo(3f, 5.15442f, 3f, 3.98164f, 3.6763f, 3.17372f)
        curveTo(3.85041f, 2.96572f, 4.05351f, 2.77954f, 4.28042f, 2.61994f)
        curveTo(5.16179f, 2f, 6.44119f, 2f, 9f, 2f)
        curveTo(11.5588f, 2f, 12.8382f, 2f, 13.7196f, 2.61994f)
        curveTo(13.9465f, 2.77954f, 14.1496f, 2.96572f, 14.3237f, 3.17372f)
        curveTo(15f, 3.98164f, 15f, 5.15443f, 15f, 7.5f)
        lineTo(15f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.5f)
        lineTo(12f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 15f)
        curveTo(16.6569f, 15f, 18f, 13.6569f, 18f, 12f)
        curveTo(18f, 10.3431f, 16.6569f, 9f, 15f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 19f)
        curveTo(18.866f, 19f, 22f, 15.866f, 22f, 12f)
        curveTo(22f, 8.13401f, 18.866f, 5f, 15f, 5f)
        }
        }.build()

        return _burningCd!!
    }

private var _burningCd: ImageVector? = null
