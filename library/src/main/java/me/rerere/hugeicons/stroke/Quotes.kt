package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Quotes: ImageVector
    get() {
        if (_quotes != null) {
            return _quotes!!
        }
        _quotes = ImageVector.Builder(
            name = "Quotes",
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
        moveTo(22f, 11.5667f)
        curveTo(22f, 16.8499f, 17.5222f, 21.1334f, 12f, 21.1334f)
        curveTo(11.3507f, 21.1343f, 10.7032f, 21.0742f, 10.0654f, 20.9545f)
        curveTo(9.60633f, 20.8682f, 9.37678f, 20.8251f, 9.21653f, 20.8496f)
        curveTo(9.05627f, 20.8741f, 8.82918f, 20.9948f, 8.37499f, 21.2364f)
        curveTo(7.09014f, 21.9197f, 5.59195f, 22.161f, 4.15111f, 21.893f)
        curveTo(4.69874f, 21.2194f, 5.07275f, 20.4112f, 5.23778f, 19.5448f)
        curveTo(5.33778f, 19.0148f, 5.09f, 18.5f, 4.71889f, 18.1231f)
        curveTo(3.03333f, 16.4115f, 2f, 14.1051f, 2f, 11.5667f)
        curveTo(2f, 6.28357f, 6.47778f, 2f, 12f, 2f)
        curveTo(17.5222f, 2f, 22f, 6.28357f, 22f, 11.5667f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.7456f, 10f)
        curveTo(10.7456f, 9.05719f, 10.7456f, 8.58579f, 10.4347f, 8.29289f)
        curveTo(10.1239f, 8f, 9.62351f, 8f, 8.62281f, 8f)
        curveTo(7.62211f, 8f, 7.12176f, 8f, 6.81088f, 8.29289f)
        curveTo(6.5f, 8.58579f, 6.5f, 9.05719f, 6.5f, 10f)
        curveTo(6.5f, 10.9428f, 6.5f, 11.4142f, 6.81088f, 11.7071f)
        curveTo(7.12176f, 12f, 7.62211f, 12f, 8.62281f, 12f)
        curveTo(9.62351f, 12f, 10.1239f, 12f, 10.4347f, 11.7071f)
        curveTo(10.7456f, 11.4142f, 10.7456f, 10.9428f, 10.7456f, 10f)
        moveTo(10.7456f, 10f)
        lineTo(10.7456f, 12.0687f)
        curveTo(10.7456f, 13.9022f, 9.41052f, 15.4571f, 7.5614f, 16f)
        moveTo(17.5f, 10f)
        curveTo(17.5f, 9.05719f, 17.5f, 8.58579f, 17.1891f, 8.29289f)
        curveTo(16.8782f, 8f, 16.3779f, 8f, 15.3772f, 8f)
        curveTo(14.3765f, 8f, 13.8761f, 8f, 13.5653f, 8.29289f)
        curveTo(13.2544f, 8.58579f, 13.2544f, 9.05719f, 13.2544f, 10f)
        curveTo(13.2544f, 10.9428f, 13.2544f, 11.4142f, 13.5653f, 11.7071f)
        curveTo(13.8761f, 12f, 14.3765f, 12f, 15.3772f, 12f)
        curveTo(16.3779f, 12f, 16.8782f, 12f, 17.1891f, 11.7071f)
        curveTo(17.5f, 11.4142f, 17.5f, 10.9428f, 17.5f, 10f)
        moveTo(17.5f, 10f)
        verticalLineTo(12.0687f)
        curveTo(17.5f, 13.9022f, 16.1649f, 15.4571f, 14.3158f, 16f)
        }
        }.build()

        return _quotes!!
    }

private var _quotes: ImageVector? = null
