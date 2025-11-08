package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ranking: ImageVector
    get() {
        if (_ranking != null) {
            return _ranking!!
        }
        _ranking = ImageVector.Builder(
            name = "Ranking",
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
        moveTo(3.5f, 18f)
        curveTo(3.5f, 16.5858f, 3.5f, 15.8787f, 3.93934f, 15.4393f)
        curveTo(4.37868f, 15f, 5.08579f, 15f, 6.5f, 15f)
        horizontalLineTo(7f)
        curveTo(7.94281f, 15f, 8.41421f, 15f, 8.70711f, 15.2929f)
        curveTo(9f, 15.5858f, 9f, 16.0572f, 9f, 17f)
        verticalLineTo(22f)
        horizontalLineTo(3.5f)
        verticalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 19f)
        curveTo(15f, 18.0572f, 15f, 17.5858f, 15.2929f, 17.2929f)
        curveTo(15.5858f, 17f, 16.0572f, 17f, 17f, 17f)
        horizontalLineTo(17.5f)
        curveTo(18.9142f, 17f, 19.6213f, 17f, 20.0607f, 17.4393f)
        curveTo(20.5f, 17.8787f, 20.5f, 18.5858f, 20.5f, 20f)
        verticalLineTo(22f)
        horizontalLineTo(15f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 22f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 16f)
        curveTo(9f, 14.5858f, 9f, 13.8787f, 9.43934f, 13.4393f)
        curveTo(9.87868f, 13f, 10.5858f, 13f, 12f, 13f)
        curveTo(13.4142f, 13f, 14.1213f, 13f, 14.5607f, 13.4393f)
        curveTo(15f, 13.8787f, 15f, 14.5858f, 15f, 16f)
        verticalLineTo(22f)
        horizontalLineTo(9f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6911f, 2.57767f)
        lineTo(13.395f, 3.99715f)
        curveTo(13.491f, 4.19475f, 13.7469f, 4.38428f, 13.9629f, 4.42057f)
        lineTo(15.2388f, 4.6343f)
        curveTo(16.0547f, 4.77141f, 16.2467f, 5.36824f, 15.6587f, 5.957f)
        lineTo(14.6668f, 6.95709f)
        curveTo(14.4989f, 7.12646f, 14.4069f, 7.4531f, 14.4589f, 7.68699f)
        lineTo(14.7428f, 8.925f)
        curveTo(14.9668f, 9.90492f, 14.4509f, 10.284f, 13.591f, 9.77185f)
        lineTo(12.3951f, 9.05808f)
        curveTo(12.1791f, 8.92903f, 11.8232f, 8.92903f, 11.6032f, 9.05808f)
        lineTo(10.4073f, 9.77185f)
        curveTo(9.5514f, 10.284f, 9.03146f, 9.90089f, 9.25543f, 8.925f)
        lineTo(9.5394f, 7.68699f)
        curveTo(9.5914f, 7.4531f, 9.49941f, 7.12646f, 9.33143f, 6.95709f)
        lineTo(8.33954f, 5.957f)
        curveTo(7.7556f, 5.36824f, 7.94358f, 4.77141f, 8.75949f, 4.6343f)
        lineTo(10.0353f, 4.42057f)
        curveTo(10.2473f, 4.38428f, 10.5033f, 4.19475f, 10.5993f, 3.99715f)
        lineTo(11.3032f, 2.57767f)
        curveTo(11.6872f, 1.80744f, 12.3111f, 1.80744f, 12.6911f, 2.57767f)
        }
        }.build()

        return _ranking!!
    }

private var _ranking: ImageVector? = null
