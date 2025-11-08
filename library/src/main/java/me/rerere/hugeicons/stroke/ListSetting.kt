package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ListSetting: ImageVector
    get() {
        if (_listSetting != null) {
            return _listSetting!!
        }
        _listSetting = ImageVector.Builder(
            name = "ListSetting",
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
        moveTo(16.5f, 19.8571f)
        verticalLineTo(21f)
        moveTo(16.5f, 19.8571f)
        curveTo(15.4878f, 19.8571f, 14.5961f, 19.3521f, 14.073f, 18.5852f)
        moveTo(16.5f, 19.8571f)
        curveTo(17.5122f, 19.8571f, 18.4039f, 19.3521f, 18.927f, 18.5852f)
        moveTo(16.5f, 14.1429f)
        curveTo(17.5123f, 14.1429f, 18.4041f, 14.648f, 18.9271f, 15.415f)
        moveTo(16.5f, 14.1429f)
        curveTo(15.4877f, 14.1429f, 14.5959f, 14.648f, 14.0729f, 15.415f)
        moveTo(16.5f, 14.1429f)
        verticalLineTo(13f)
        moveTo(20f, 14.7143f)
        lineTo(18.9271f, 15.415f)
        moveTo(13.0004f, 19.2857f)
        lineTo(14.073f, 18.5852f)
        moveTo(13f, 14.7143f)
        lineTo(14.0729f, 15.415f)
        moveTo(19.9996f, 19.2857f)
        lineTo(18.927f, 18.5852f)
        moveTo(18.9271f, 15.415f)
        curveTo(19.2364f, 15.8685f, 19.4167f, 16.4136f, 19.4167f, 17f)
        curveTo(19.4167f, 17.5864f, 19.2363f, 18.1316f, 18.927f, 18.5852f)
        moveTo(14.0729f, 15.415f)
        curveTo(13.7636f, 15.8685f, 13.5833f, 16.4136f, 13.5833f, 17f)
        curveTo(13.5833f, 17.5864f, 13.7637f, 18.1316f, 14.073f, 18.5852f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 3f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 15f)
        horizontalLineTo(9f)
        }
        }.build()

        return _listSetting!!
    }

private var _listSetting: ImageVector? = null
