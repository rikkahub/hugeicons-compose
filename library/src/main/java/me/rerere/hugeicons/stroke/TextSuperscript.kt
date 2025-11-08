package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextSuperscript: ImageVector
    get() {
        if (_textSuperscript != null) {
            return _textSuperscript!!
        }
        _textSuperscript = ImageVector.Builder(
            name = "TextSuperscript",
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
        moveTo(12f, 21f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.75f, 3f)
        curveTo(9.75f, 2.58579f, 9.41421f, 2.25f, 9f, 2.25f)
        curveTo(8.58579f, 2.25f, 8.25f, 2.58579f, 8.25f, 3f)
        horizontalLineTo(9.75f)
        moveTo(8.25f, 21f)
        curveTo(8.25f, 21.4142f, 8.58579f, 21.75f, 9f, 21.75f)
        curveTo(9.41421f, 21.75f, 9.75f, 21.4142f, 9.75f, 21f)
        horizontalLineTo(8.25f)
        moveTo(8.25f, 3f)
        verticalLineTo(21f)
        horizontalLineTo(9.75f)
        verticalLineTo(3f)
        horizontalLineTo(8.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 6f)
        curveTo(16f, 5.37191f, 16f, 5.05787f, 15.9194f, 4.78267f)
        curveTo(15.7518f, 4.21026f, 15.3066f, 3.71716f, 14.7541f, 3.49226f)
        curveTo(14.4886f, 3.38413f, 14.1885f, 3.35347f, 13.5884f, 3.29216f)
        curveTo(12.1695f, 3.14718f, 10.3874f, 3f, 9f, 3f)
        curveTo(7.61262f, 3f, 5.83047f, 3.14718f, 4.41161f, 3.29216f)
        curveTo(3.8115f, 3.35347f, 3.51144f, 3.38413f, 3.24586f, 3.49226f)
        curveTo(2.69344f, 3.71716f, 2.24816f, 4.21026f, 2.08057f, 4.78267f)
        curveTo(2f, 5.05787f, 2f, 5.37191f, 2f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        horizontalLineTo(20f)
        curveTo(19.5286f, 12f, 19.2929f, 12f, 19.1464f, 11.8566f)
        curveTo(19f, 11.7133f, 19f, 11.4825f, 19f, 11.021f)
        verticalLineTo(10.0766f)
        curveTo(19f, 9.28117f, 19.176f, 9.12533f, 20.0004f, 9.10939f)
        curveTo(20.7769f, 9.09438f, 21.2401f, 9.03883f, 21.5607f, 8.83328f)
        curveTo(22f, 8.55161f, 22f, 8.09827f, 22f, 7.19159f)
        curveTo(22f, 5.45943f, 19f, 6.12617f, 19f, 6.12617f)
        }
        }.build()

        return _textSuperscript!!
    }

private var _textSuperscript: ImageVector? = null
